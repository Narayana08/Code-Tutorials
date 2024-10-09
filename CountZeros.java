
public class CountZeros {

    public static void main(String args[]) {
        int n = 10400;
        int zeros = countZeros(n);
        System.out.println("the number of zeros in the given number " + n + " is " + zeros);
    }

    private static int countZeros(int n) {
        int count = 0;
        return helper(n, count);
    }

    private static int helper(int n, int count) {
        if (n <= 0) {
            return count;
        }

        if (n % 10 == 0) {
            return helper(n / 10, count + 1);
        }

        return helper(n / 10, count);
    }
}
