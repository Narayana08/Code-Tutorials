
class DiamondPattern {

    public static void main(String[] args) {

        int n = 5;
        printDiamond(n);

    }

    private static void printDiamond(int n) {

        for (int row = 0; row < n; row++) {

            for (int spaces = 0; spaces < (n - row - 1); spaces++) {
                System.out.print(" ");
            }

            for (int col = 0; col < (2 * (row + 1) - 1); col++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int row = 0; row < n; row++) {

            for (int spaces = 0; spaces < row; spaces++) {
                System.out.print(" ");
            }

            for (int col = 0; col < 2 * (n - row) - 1; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}
