import java.util.Random;

public class KthSmallestElement {

    // Method to find the kth smallest element
    public static int kthSmallest(int[] arr, int k) {
        return quickSelect(arr, 0, arr.length - 1, k - 1);
    }

    // QuickSelect method to partition the array and find the kth element
    private static int quickSelect(int[] arr, int low, int high, int k) {
        if (low == high) {
            return arr[low];
        }

        // Select pivot using partition method
        int pivotIndex = partition(arr, low, high);

        // If pivotIndex is the kth element, return it
        if (pivotIndex == k) {
            return arr[pivotIndex];
        }
        // If k is less, look in the left part of the array
        else if (k < pivotIndex) {
            return quickSelect(arr, low, pivotIndex - 1, k);
        }
        // If k is greater, look in the right part of the array
        else {
            return quickSelect(arr, pivotIndex + 1, high, k);
        }
    }

    // Partition method used for QuickSelect
    private static int partition(int[] arr, int low, int high) {
        Random rand = new Random();
        int pivotIndex = low + rand.nextInt(high - low + 1); // Random pivot selection
        swap(arr, pivotIndex, high);

        int pivot = arr[high];
        int i = low;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                swap(arr, i, j);
                i++;
            }
        }

        swap(arr, i, high);
        return i;
    }

    // Utility method to swap two elements in an array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Driver code to test the solution
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println("The " + k + "rd smallest element is " + kthSmallest(arr, k));
    }
}
