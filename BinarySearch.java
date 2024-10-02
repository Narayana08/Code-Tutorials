
class BinarySearch {


    /*
     * In order to perform operations using binary search , the pre-condition is the array should be sorted either in ASC/DESC
     *  further, we need to find the middle element of the array, if the target element is greater than the middle element,
     *  the start index changes from 0 -> mid + 1, or if the target element is less than the middle element, the end index will
     *  change from array.length -> mid - 1.
     * */

    public static void main(String[] args) {

        try {

            System.out.println("Binary Search.........");
            int[] elements = {2, 4, 6, 9, 11, 12, 14, 20, 33, 36, 48};
            int target = 36;
            int targetElement = findTargetElement(elements, target);
            System.out.println("targetElement " + targetElement);

        } catch (Exception e) {
            System.out.println("Error while processing binary search " + e.getMessage());
        }

    }

    public static int findTargetElement(int[] elements, int target) {

        int start = 0;
        int end = elements.length - 1;

        while (start < end) {

            int mid = (start + end) / 2;

            System.out.println("Start " + start + "," + "End " + end + "," + "Middle " + mid);

            System.out.println("Middle Element " + elements[mid]);

            if (elements[mid] == target) {
                return mid;
            } else if (elements[mid] < target) {
                start = mid + 1;
            } else if (elements[mid] > target) {
                end = mid - 1;
            }
            System.out.println("Middle Index " + mid);
        }
        return -1;
    }

}
