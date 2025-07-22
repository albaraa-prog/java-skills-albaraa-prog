package src;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class PayrollCalculator {
    // Method to calculate weekly pay based on employee type and hours
    public static double calculateWeeklyPay(String employeeType, double hoursWorked, double hourlyRate) {
// Employee types: "FULL_TIME", "PART_TIME", "CONTRACTOR", "INTERN"
// Use switch case for different rules:
// FULL_TIME: Regular pay for 40 hours, overtime (1.5x) for hours > 40
// PART_TIME: Regular pay, no overtime, max 25 hours
// CONTRACTOR: Flat rate, no overtime rules
// INTERN: 20% discount from hourly rate, max 20 hours
// Handle invalid employee types and negative values
        int choice;
        double calculated = 0;

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
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
        } while (choice != 5);
        sc.close();
        return calculated;
    }
}
