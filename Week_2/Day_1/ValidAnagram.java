package Week_2.Day_1;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        // Length check
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        // Count characters
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        // Check counts
        for (int num : count) {
            if (num != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));
    }
}