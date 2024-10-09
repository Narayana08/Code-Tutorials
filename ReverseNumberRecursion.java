
public class ReverseNumberRecursion {

    static int sum = 0;

    public static void main(String args[]) {
        int n = 1234;
        int result = reverseNumberTwo(n);
        System.out.println("the reverse of the number " + n + " is " + result);
    }

    private static int reverseNumberTwo(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits - 1);
    }

    private static int helper(int n, double digits) {
        if (n % 10 == n) {
            return n;
        }
        double rem = n % 10;
        return (int) (rem * (Math.pow(10, digits))) + helper(n / 10, digits - 1);
    }

    private static int reverseNumber(int n) {
        if (n == 0) {
            return 0;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        return rem + reverseNumber(n / 10);
    }

}
