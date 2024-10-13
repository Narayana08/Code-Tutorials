
import java.util.ArrayList;

public class FindIndex {

    public static void main(String args[]) {
        int[] nums = {1, 4, 4, 5};
        int target = 4;
        ArrayList<Integer> list = findAllIndex(nums, 0, target);
        System.out.println("the index's where the target element " + target + " is available is " + list.toString());
    }

    private static ArrayList<Integer> findAllIndex(int[] nums, int index, int target) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index >= nums.length - 1) {
            return list;
        }

        if (nums[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> elementIndexs = findAllIndex(nums, index + 1, target);
        System.out.println("the index value is " + index + " with target element index is" + elementIndexs.toString());
        list.addAll(elementIndexs);
        return list;
    }

}
