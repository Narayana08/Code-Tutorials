
import java.util.Arrays;

public class Solution {

    public static void main(String args[]) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] result = reverseArray(nums);
        System.out.println("result " + Arrays.toString(result));
    }

    public static int[] reverseArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        reverseElements(nums, start, end);
        return nums;
    }

    public static void reverseElements(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        reverseElements(nums, start + 1, end - 1);
    }

}
