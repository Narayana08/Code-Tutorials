
class PyramidReversePattern {

    public static void main(String args[]) {

        int nums = 5;

        /*
         *  inserts the number of rows specified
         */
         for (int rows = 0; rows < nums ; rows++) {

            /*
             *   inserts spaces in the row
             */
            for (int spaces = 0; spaces < rows; spaces++) {
                System.out.print(" ");
            }

            for (int col = 0; col < (2 * (nums -  rows) - 1); col++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
