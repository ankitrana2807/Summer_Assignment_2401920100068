package Week_3.Day_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementI {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // Find next greater element for nums2
        for (int num : nums2) {

            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }

            stack.push(num);
        }

        // Remaining elements have no greater element
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        int[] ans = nextGreaterElement(nums1, nums2);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}