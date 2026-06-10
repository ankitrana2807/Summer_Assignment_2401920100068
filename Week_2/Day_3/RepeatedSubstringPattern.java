package Week_2.Day_3;

public class RepeatedSubstringPattern {

    public static boolean repeatedSubstringPattern(String s) {

        // Double the string
        String doubled = s + s;

        // Remove first and last character
        String trimmed = doubled.substring(1, doubled.length() - 1);

        // Check if original string exists
        return trimmed.contains(s);
    }

    public static void main(String[] args) {

        String s = "abab";

        System.out.println(repeatedSubstringPattern(s));
    }
}