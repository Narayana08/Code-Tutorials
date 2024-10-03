
public class Factorial {

    public static void main(String args[]) {
        int n = 10;
        int result = factorial(5);
        System.out.println("The factorial of number " + n + " is " + result);
    }

    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
