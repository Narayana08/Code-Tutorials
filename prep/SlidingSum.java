
public class SlidingSum {

    public static void main(String args[]) {
        int[] nums = {-1, 2, 3, 3, 4, 5, -1};
        int slide = 4;
        int result = getMaxSum(nums, slide);
        System.out.println("Result " + result);
    }

    private static int getInitialSum(int[] nums, int slide) {
        int start = 0;
        int end = slide;
        int sum = 0;
        while (start < end) {
            sum = sum + nums[start];
            start++;
        }
        System.out.println(" sum " + sum);
        return sum;
    }

    private static int getMaxSum(int[] nums, int slide) {
        int len = nums.length;
        int start = 0;
        int end = slide;
        int maxSum = 0;
        int sum = getInitialSum(nums, slide);
        while (end < len) {
            sum = sum - nums[start];
            start++;
            end++;
            sum = sum + nums[end];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
