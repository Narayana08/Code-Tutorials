
import java.util.HashMap;
import java.util.Map;

public class FibonacciTopDown {

    private Map<Integer, Integer> memo = new HashMap<>();

    public int fib(int n) {
        // Base cases
        if (n <= 1) {
            return n;
        }

        // If the value is already computed, return it
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // Otherwise, compute and store it in memo
        int result = fib(n - 1) + fib(n - 2);
        System.out.println("number :" + n + " ,result :" + result);
        memo.put(n, result);

        return result;
    }

    public static void main(String[] args) {
        FibonacciTopDown fib = new FibonacciTopDown();
        int n = 10;
        System.out.println("Fibonacci of " + n + ": " + fib.fib(10)
        );  // Output: 55
    }
}
