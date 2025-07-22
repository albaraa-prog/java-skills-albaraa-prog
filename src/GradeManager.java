package src;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeManager {
    // Method to reverse student names in an array
    public static String[] reverseStudentNames(String[] names) {
        for(int i = 0; i < names.length ; i++){
            String mod = new StringBuilder(names[i]).reverse().toString();
            names[i] = mod;
        }
        return names;
    }

    // Method to calculate letter grades
    public static char getLetterGrade(int score) {
        char grade = 0;
        if(score >= 90 && score <= 100){
            grade = 'A';
        } else if(score >= 80 && score <= 89) {
            grade = 'B';
        } else if(score >= 70 && score <= 79){
            grade = 'C';
        } else if(score >= 60 && score <= 69) {
            grade = 'D';
        } else if(score < 60){
            grade = 'F';
        } else {
            System.out.println("Invalid Input");
        }
        return grade;
    }
    // Method to find students who need to retake exam
    public static ArrayList<String> findFailingStudents(String[] names, int[] scores) {
// Return array of names where score is below 60
// Use loops to check each student

        ArrayList<String> needRetake = new ArrayList<String>();
        for(int i = 0; i < scores.length; i++){
            if(scores[i] < 60){
                String faildStudent = names[i];
                needRetake.add(faildStudent);
            }
        }
        return needRetake;
    }

    public static void main(String[] args) {
        String[] students = {"Alice", "Bob", "Charlie", "Diana"};
        int[] scores = {95, 67, 45, 78};
        System.out.println(Arrays.toString(reverseStudentNames(students)));
        System.out.println(getLetterGrade(scores[3]));
        System.out.println(findFailingStudents(students, scores));
    }
}
