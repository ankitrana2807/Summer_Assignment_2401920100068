package Week_2.Day_5;

public class StringCompression {

    public static int compress(char[] chars) {

        int index = 0; // write pointer
        int i = 0;

        while (i < chars.length) {

            char currentChar = chars[i];
            int count = 0;

            // Count consecutive occurrences
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            // Write character
            chars[index++] = currentChar;

            // Write count if greater than 1
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }

    public static void main(String[] args) {

        char[] chars = {'a','a','b','b','c','c','c'};

        int length = compress(chars);

        System.out.println(length);

        for (int i = 0; i < length; i++) {
            System.out.print(chars[i] + " ");
        }
    }
}
