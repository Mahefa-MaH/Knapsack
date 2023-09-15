public class Knapsack {
    private int max(int a, int b) {
        return (a > b) ? a : b;
    }

    int[][] Kinv;

    public int knapSack(int W, int wt[], int val[], int n) {

        int K[][] = new int[n + 1][W + 1];

        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (wt[i - 1] <= w)
                    K[i][w] = max(val[i - 1] + K[i - 1][w - wt[i - 1]], K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }
        Kinv = K;
        return K[n][W];
    }

    public void inverseKS(int K[][], int W, int wt[], int val[], int n) {
   
        for (int i = n; i >= 0; i--) {
            if(K[i][W] == 0 || W == 0){
                break;
            }
            if(K[i][W] != K[i - 1][W]){
                System.out.println("Objet numero : "+i);
                W = W - wt[i - 1];
            }
        }
    }

    public int[][] getK(){
        return Kinv;
    }

}
