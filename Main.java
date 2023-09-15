public class Main{
    public static void main(String args[]) {
        int profit[] = new int[]{60, 100, 120};
        int weight[] = new int[]{10, 20, 30};
        int W = 50;
        int n = profit.length;

        Knapsack knapsack = new Knapsack();
        int maxValue = knapsack.knapSack(W, weight, profit, n);
        int[][] K_inv = knapsack.getK();
        // System.out.println("K_inv: ");
        // for (int i = 0; i <= n; i++) {
        //     for (int w = 0; w <= W; w++) {
        //         System.out.print(K_inv[i][w] + " ");
        //     }
        //     System.out.println();
        // }
        knapsack.inverseKS(K_inv, W, weight, profit, n);

        System.out.println("Maximum Value: " + maxValue);
    }
}
