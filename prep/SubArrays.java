class SubArrays {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int len = nums.length;
        for (int start = 0; start < len; start++) {
            for (int end = start; end < len; end++) {
                System.out.print("[");
                for (int k = start; k <= end; k++) {
                    System.out.print(nums[k] + (k < end ? "," : ""));
                }
                System.out.println("]");
            }
        }
    }
}