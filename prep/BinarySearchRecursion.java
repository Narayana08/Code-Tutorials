
public class BinarySearchRecursion {

    public static void main(String args[]) {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 6;
        int start = 0;
        int end = input.length - 1;
        int index = findIndexByRecursion(input, start, end, target);
        System.out.println("The target element " + target + " index is " + index);
    }

    private static int findIndexByRecursion(int[] input, int start, int end, int target) {

        if (start > end) {
            return -1;
        }

        int mid = (start + end) / 2;

        if (input[mid] == target) {
            return mid;
        } else if (input[mid] > target) {
            return findIndexByRecursion(input, start, mid - 1, target);
        } else {
            return findIndexByRecursion(input, mid + 1, end, target);
        }

    }
}
