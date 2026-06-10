package Week_2.Day_3;

public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {

        int i = 0; // pointer for s
        int j = 0; // pointer for t

        while (i < s.length() && j < t.length()) {

            // Match found
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }

            j++;
        }

        // If all characters of s are matched
        return i == s.length();
    }

    public static void main(String[] args) {

        String s = "abc";
        String t = "ahbgdc";

        System.out.println(isSubsequence(s, t));
    }
}
