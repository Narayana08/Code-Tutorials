
import java.util.Arrays;

public class KRotate {

    public static void main(String args[]) {
        int k = 8;
        int[] nums = {3, 4, 1, 5, 3, -5};
        rotateArrayByK(k, nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotateArrayByK(int k, int[] nums) {
        int len = nums.length;
        if (k > len) {
            k = k % len;
        }

        System.out.println(" K " + k);
        int[] temp = new int[k];
        System.arraycopy(nums, 0, temp, 0, k);

        System.out.println("temp" + Arrays.toString(temp));

        for (int i = k; i < len; i++) {
            nums[i - k] = nums[i];
            System.out.println(Arrays.toString(nums));
        }

        System.arraycopy(temp, 0, nums, len - k, k);

    }
}
