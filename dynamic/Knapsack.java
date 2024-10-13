
public class Knapsack {

    // Function to solve the 0/1 Knapsack problem
    public int knapSack(int W, int[] weight, int[] value, int n) {
        int[][] dp = new int[n + 1][W + 1];

        // Build table dp[][] in a bottom-up manner
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;  // Base case: no items or zero capacity
                } else if (weight[i - 1] <= w) {
                    dp[i][w] = Math.max(value[i - 1] + dp[i - 1][w - weight[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }
        return dp[n][W];  // Maximum value with n items and capacity W
    }

    public static void main(String[] args) {
        Knapsack knapsack = new Knapsack();
        int[] value = {60, 100, 120};
        int[] weight = {10, 20, 30};
        int W = 50;
        int n = value.length;
        System.out.println("Maximum value: " + knapsack.knapSack(W, weight, value, n));  // Output: 220
    }
}
