
import java.util.Arrays;

class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        int[] sort = selection(arr);
        System.out.println("Sorted Array" + Arrays.toString(sort));
    }

    static int[] selection(int[] arr) {
        for (int index = 0; index < arr.length - 1; index++) {
            int lastIndex = arr.length - index - 1;
            int maxIndex = getMaxElementIndex(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex);
        }
        return arr;
    }

    private static int getMaxElementIndex(int[] arr, int startIndex, int lastIndex) {
        int max = startIndex;
        for (int index = 0; index <= lastIndex; index++) {
            if (arr[max] < arr[index]) {
                max = index;
            }
        }
        return max;
    }

    private static void swap(int[] arr, int maxIndex, int lastIndex) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[lastIndex];
        arr[lastIndex] = temp;
    }
}
