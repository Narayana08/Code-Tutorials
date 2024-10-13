
class Kite {

    public static void main(String[] args) {

        int n = 5;
        printPyramid(n);

    }

    private static void printPyramid(int n) {

        int stars = 0;

        for (int row = 0; row < 2*n -1; row++) {

            if (row < n) {
                stars++;
            } else {
                stars--;
            }

            for (int col = 0; col < stars; col++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
