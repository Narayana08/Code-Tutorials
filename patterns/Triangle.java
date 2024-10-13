
public class Triangle {

    public static void main(String args[]) {
        int row = 4;
        int col = 0;
        printTriangle(row, col);
    }

    private static void printTriangle(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            System.out.print("*");
            printTriangle(row, col + 1);
        } else {
            System.out.println("");
            printTriangle(row - 1, 0);
        }
    }
}
