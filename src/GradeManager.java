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
}
