
public class Steps {

    public static void main(String args[]) {
        int n = 2;
        int steps = findSteps(n);
        System.out.println("the number of steps to deduce number " + n + " to zero is " + steps);
    }

    private static int findSteps(int n) {
        int step = 0;
        return helper(n, step);
    }

    private static int helper(int n, int step) {
        if (n == 0) {
            return step;
        }

        if (n % 2 == 0) {
            return helper(n / 2, step + 1);
        } else {
            return helper(n - 1, step + 1);
        }
    }

}
