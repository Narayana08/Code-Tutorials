
public class DigitSumRecursion {

    public static void main(String args[]) {
        int n = 1312;
        int result = digitSum(n);
        //int product = productDigits(n);
        //System.out.println("Sum of all the digits of a number " + n + " is " + result);
        System.out.println("product of all digits of " + n + " is "  + result);
    }

    private static int digitSum(int num) {

        if (num < 10) {
            return num;
        }

        int sum = 0;

        while (num > 0) {
            sum = num % 10 + sum;
            num = num / 10;
        }
        return digitSum(sum);

    }

    private static int productDigits(int n) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * productDigits(n / 10);
    }
}
