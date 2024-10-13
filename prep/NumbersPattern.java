
class NumbersPattern {

    /*
    * 1        1
    * 12      21
    * 123    321
    * 1234  4321
    * 1234554321
     */
    public static void main(String[] args) {
        int n = 5;
        printNumbersPattern(n);
    }

    private static void printNumbersPattern(int n) {

        int value = 0;

        for (int row = 1; row <= n; row++) {

            for (int spaces = 0; spaces < 2 * (row); spaces++) {

            }

            for (int col = 0; col <= ((2 * row) - row); col++) {

                if (row <= n) {
                    value++;
                } else {
                    value--;
                }

                System.out.print(value);
            }
            value = 0;

            System.out.println("");
        }

    }
}
