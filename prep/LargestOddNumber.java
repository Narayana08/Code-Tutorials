
class LargeOddNumber {

    public static String largeOddNum(String s) {
        int max = 0;
        int length = s.length() - 1;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                String num = s.substring(i, j);
                System.out.println("Num" + num);
                int number = Integer.parseInt(num);
                if (number > max && (number % 2 != 0)) {
                    max = number;
                }
            }
        }
        String result = Integer.toString(max);
        System.out.println("result" + result);
        return result;
    }

    public static void main(String[] args) {
        String s = "0214638";
    }
}
