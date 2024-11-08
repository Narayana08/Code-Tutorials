import java.util.Arrays;

public class Hashing {

    public static void main(String args[]) {
        int[] arr = {5, 6, 5, 6, 9, 6};
        int[] hashTable = new int[10];
        System.out.println("hash" + Arrays.toString(hashTable));
        for (int num : arr) {
            System.out.println("hashTable " + hashTable[num] + "num " + num);
            hashTable[num]++;
        }

        int index = 0;
        int min = 0;
        for (int i = 0; i < hashTable.length - 1; i++) {
            if (hashTable[i] != 0 && hashTable[i] < min) {
                min = hashTable[i];
                index = i;
            }
        }

        System.out.println("index " + index);
        System.err.println("");
        System.out.println(Arrays.toString(hashTable));
        System.out.println(hashTable[6]);  // Output: 3

    }
}
