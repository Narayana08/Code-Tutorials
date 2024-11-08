
class SortedArray {

    public static boolean arraySortedOrNot(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {-95, 84, 47, 30, -20, -38, -25, -24, 91, -18, -55, -20, 18, -48, 19};
        //int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        boolean result = arraySortedOrNot(arr, n);
        System.out.println("result" + result);
    }

}
