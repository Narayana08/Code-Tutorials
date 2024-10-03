
public class DigitSumRecursion {

    public static void main(String args[]) {
        int n = 1312;
        int result = digitSum(n);
        int product = productDigits(n);
        //System.out.println("Sum of all the digits of a number " + n + " is " + result);
        System.out.println("product of all digits of " + n + " is " + product);
    }

    private static int digitSum(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + digitSum(n / 10);
    }

    private static int productDigits(int n) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * productDigits(n / 10);
    }
}
