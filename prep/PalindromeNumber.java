
public class PalindromeNumber {

    public static void main(String args[]) {
        int n = 1231;
        boolean result = checkPalindrome(n);
        System.out.println("RESULT" + result);
    }

    private static boolean checkPalindrome(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        int result = helper(n, digits - 1);
        return (result == n);
    }

    private static int helper(int n, double digits) {
        if (n % 10 == n) {
            return n;
        }
        double rem = n % 10;
        return (int) (rem * (Math.pow(10, digits))) + helper(n / 10, digits - 1);
    }
}
