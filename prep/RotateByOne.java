
import java.util.Arrays;

public class RotateByOne {

    public static void main(String args[]) {
        int[] nums = {1, 2, 3, 4, 5};
        rotateArrayByOne(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void rotateArrayByOne(int[] nums) {
        int len = nums.length;
        int temp = nums[0];
        for (int i = 0; i < len - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[len - 1] = temp;
    }

}
