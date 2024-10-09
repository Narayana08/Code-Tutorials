
public class CountZeros {

    public static void main(String args[]) {
        int n = 1004;
        int zeros = countZeros(n);
        System.out.println("the number of zeros in the given number " + n + " is " + zeros);
    }

    private static int countZeros(int n) {
        int count = 0;
        while (n > 0) {
            System.out.println("n value" + n);
            if (n % 10 == 0) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }
}
