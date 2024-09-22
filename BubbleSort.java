
import java.util.Arrays;

public class BubbleSort {

    public static int[] sortElements(int[] array) {

        int arrayLength = array.length - 1;

        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength - i; j++) {
                System.out.println("Before Sorting " + Arrays.toString(array) + "with j value as " + j + "and array length " + (arrayLength - i));
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
                System.out.println("After Sorting" + Arrays.toString(array));
            }
        }
        return array;
    }

    public static void main(String args[]) {

        int[] array = {5, 4, 2, 1, 8};
        int[] sortedArray = sortElements(array);
        System.out.println("sortedArray" + Arrays.toString(sortedArray));

    }

}
