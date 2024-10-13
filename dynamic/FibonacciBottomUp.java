
public class FibonacciBottomUp {

    public int fib(int n) {
        if (n <= 1) {
            return n;
        }

        // Create a table to store Fibonacci numbers
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        // Fill the table using the relation F(n) = F(n-1) + F(n-2)
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        FibonacciBottomUp fib = new FibonacciBottomUp();
        System.out.println("Fibonacci of 10: " + fib.fib(10));  // Output: 55
    }
}
