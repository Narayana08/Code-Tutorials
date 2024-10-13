
public class PyramidPattern {

    public static void main(String[] args) {
        pattern7(5);
    }

    public static void pattern7(int n) {

        for (int row = 0; row < n; row++) {

            for (int spaces = 0; spaces < (n - 1 - row); spaces++) {
                System.out.print(" ");
            }

            for (int stars = 0; stars < (2 * (row + 1) - 1); stars++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
