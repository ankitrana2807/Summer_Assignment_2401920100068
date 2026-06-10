package Week_2.Day_3;

public class ImplementStrStr {

    public static int strStr(String haystack, String needle) {

        // Edge case
        if (needle.length() == 0) {
            return 0;
        }

        // Traverse haystack
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            int j = 0;

            // Compare characters
            while (j < needle.length() &&
                   haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            // Found complete match
            if (j == needle.length()) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        String haystack = "sadbutsad";
        String needle = "sad";

        System.out.println(strStr(haystack, needle));
    }
}