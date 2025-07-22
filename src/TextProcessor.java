package src;


import java.util.Arrays;

public class TextProcessor {
    // Count words in a sentence
    public static int countWords(String sentence) {

        String[] split = null;
        if (sentence.isEmpty()) {
            System.out.println("Cannot Count empty sentence!");
        } else {
            split = sentence.split(" ");
        }
        //for (int i = 0; i < split.length; i++) {}

        return split.length;
    }

    // Replace specific words
    public static String replaceWord(String text, String oldWord, String newWord) {
// Replace all occurrences of oldWord with newWord
        String[] spl = text.split(" ");
        for(int i = 0; i < spl.length; i++){
            if(spl[i].equals(oldWord)){
                spl[i] = newWord;
            }
        }
        text = Arrays.toString(spl);
        return text;
    }
    public static void main(String[] args) {
        System.out.println(countWords("Java is fun and Java is powerful"));
        System.out.println(replaceWord("Java is fun and Java is powerful", "Java", "Prgramming"));
    }
}
