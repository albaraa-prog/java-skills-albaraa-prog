package src;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;
import java.util.WeakHashMap;

public class PayrollCalculator {
    public static double calculateWeeklyPay(String employeeType, double hoursWorked, double hourlyRate) {
        int choice;
        double calculated = 0;
        Boolean overtime = false;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("===Welcome to Employee Payroll System===");
            System.out.println("Please choose employee type number!");
            System.out.println("1. FULL_TIME");
            System.out.println("2. PART_TIME");
            System.out.println("3. CONTRACTOR");
            System.out.println("4. INTERN");
            System.out.println("5. Exit");

            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter working hours: ");
                    hoursWorked = sc.nextDouble();
                    System.out.println("Enter hourly rate: ");
                    hourlyRate = sc.nextDouble();

                    if (hoursWorked > 40){
                        calculated = (hoursWorked * hourlyRate) * 1.5;
                    }else {
                        calculated = hoursWorked * hourlyRate;
                    }
                    System.out.println("Result: " + calculated);
                    break;
                case 2:
                    System.out.println("Enter working hours: ");
                    hoursWorked = sc.nextDouble();
                    if (hoursWorked >= 25){
                        System.out.println("Max working hours is 25! Try again.");
                        hoursWorked = sc.nextDouble();
                    }
                    System.out.println("Enter hourly rate: ");
                    hourlyRate = sc.nextDouble();

                    calculated = hoursWorked * hourlyRate;
                    System.out.println("Result: " + calculated);
                    break;
                case 3:
                    System.out.println("Enter working hours: ");
                    hoursWorked = sc.nextDouble();
                    System.out.println("Enter hourly rate: ");
                    hourlyRate = sc.nextDouble();
                    calculated = hoursWorked * hourlyRate;
                    System.out.println("Result: " + calculated);
                    break;
                case 4:
                    System.out.println("Enter working hours: ");
                    hoursWorked = sc.nextDouble();

                    if (hoursWorked >= 20){
                        System.out.println("Max working hours is 20! Try again.");
                        hoursWorked = sc.nextDouble();
                    }
                    System.out.println("Enter hourly rate: ");
                    hourlyRate = sc.nextDouble();
                    double dis = (hoursWorked * hourlyRate) - (20 / 100);
                    calculated = (hoursWorked * hourlyRate) - dis;
                    System.out.println("Result: " + calculated);
                    break;
                case 5:
                    System.out.println("Closing System...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
        } while (choice != 5);
        sc.close();
        return calculated;
    }
}
