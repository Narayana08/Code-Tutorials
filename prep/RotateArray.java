
import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {

        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
        System.out.println("Input Array " + Arrays.toString(input));
        //result = {4,5,6,7,8,1,2,3}
        int[] result = rotateArray(input, k);
        System.out.println("Rotated Array " + Arrays.toString(result));

    }

    private static int[] rotateArray(int[] input, int k) {
        int n = input.length ;
        int[] temp = new int[k];

        // System.arraycopy(input, 0, temp, 0, k);
        for (int index = 0; index < k; index++) {
            temp[index] = input[index];
        }

        for (int index = k; index < n; index++) {
            input[index - k] = input[index];
        }

        System.out.println("array" + Arrays.toString(input));

        int j = 0;
        for (int index = n - k; index < n; index++) {
            input[index] = temp[j];
            j++;
        }

        return input;
    }

}
