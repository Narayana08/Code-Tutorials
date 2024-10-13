
class Recursion {

    public static void main(String[] args) {
        int n = 1;
        // int result = fibonacii(n);
        printFibonacii(n);
        fibonacii(n);
        //System.out.println("result " + result);
    }

    private static int fibonacii(int n) {

        if (n < 2) {
            return n;
        }

        return fibonacii(n - 1) + fibonacii(n - 2);
    }

    private static void printFibonacii(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacii Series: " + a + " " + b);

        for (int number = 0; number < n; number++) {
            int sum = a + b;
            a = b;
            b = sum;
            System.out.print(" " + sum);
        }
    }
}
