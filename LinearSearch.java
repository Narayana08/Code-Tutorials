
import java.text.SimpleDateFormat;
import java.util.Date;

class LinearSearch {

    public static void main(String[] args) {
        int[][] arr = {{1, 5}, {7, 3}, {3, 5}, {1, 5}, {7, 3}, {3, 5}, {1, 5}, {7, 3}, {3, 5}, {1, 5}, {7, 3}, {3, 5}};
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date startTime = new Date();
        System.out.println("Start time: " + dateFormatter.format(startTime));
        int[] totalAccountSums = maxAmount(arr);
        int maxWealth = getMaxWealthAccountSum(totalAccountSums);
        Date endTime = new Date();
        System.out.println("End time: " + dateFormatter.format(endTime));
        long timeTaken = endTime.getTime() - startTime.getTime();
        System.out.println("Time taken to execute the function call is" + timeTaken);
        System.out.println(maxWealth);
    }

    public static int[] maxAmount(int[][] arr) {
        int[] totalSumAccount = new int[arr.length];
        for (int person = 0; person < arr.length; person++) {
            int accountAmount = 0;
            for (int account = 0; account < arr[person].length; account++) {
                accountAmount = accountAmount + arr[person][account];
                totalSumAccount[person] = accountAmount;
            }
        }
        return totalSumAccount;
    }

    public static int getMaxWealthAccountSum(int[] accountSum) {
        int maxSum = accountSum[0];
        for (int account : accountSum) {
            if (account > maxSum) {
                maxSum = account;
            }
        }
        return maxSum;
    }

}
