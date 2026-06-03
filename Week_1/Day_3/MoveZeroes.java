public class MoveZeroes {

    public static void moveZeroes(int[] nums) {

        int position = 0;

        // Non-zero elements ko aage shift karo
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[position] = nums[i];
                position++;
            }
        }

        // Baaki jagah zero fill karo
        while (position < nums.length) {
            nums[position] = 0;
            position++;
        }
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        moveZeroes(arr);

        System.out.println("Array after moving zeroes:");

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}