package src;

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
        char grade = 'A';
        if(score >= 90 && score <= 100){
            grade = 'A';
        } else if(score >= 80 && score <= 89) {
            grade = 'B';
        } else if(score >= 70 && score <= 79){
            grade = 'C';
        } else if(score >= 60 && score <= 69) {
            grade = 'D';
        } else if(grade <= 60){
            grade = 'F';
        } else {
            System.out.println("Invalid Input");
        }
// Use if-else conditions:
// 90-100: 'A', 80-89: 'B', 70-79: 'C', 60-69: 'D', below 60: 'F'
        return grade;
    }
}
