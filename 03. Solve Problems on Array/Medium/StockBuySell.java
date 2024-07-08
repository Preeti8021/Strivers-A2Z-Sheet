//Brute force of two loops - but time limit exceeds - not very good approach
public class StockBuySell1 {
    public int maxProfit(int[] prices) {
        int sum = 0 ;
        int n = prices.length;
        for(int i =0; i<n;i++){
            for(int j = i+1; j<n; j++){
                if(prices[j]>prices[i]){
                    sum = Math.max(sum,prices[j]-prices[i]);
                }
            }
        }
        return sum;
    }
}

//Greedy approach - to find the maximum profit TC O(N), SC O(1)
public class StockBuySell {
    public int maxProfit(int[] prices) {
        int profit = 0 ;
        int n = prices.length;
        int start = prices[0];
        for(int i =1; i<n;i++){
            if(prices[i]>start){
                profit = Math.max(profit,prices[i]-start);
            }
            if(prices[i]<start){
                start = prices[i];
            }
        }
        return profit;
    }
}

//Dp approach - TC O(N), SC O(N)
public class StockBuySell2 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0; 
        }
        int n = prices.length;
        int[] dp = new int[n];
        int minPrice = prices[0]; // Initialize minPrice with the first price
        
        for (int i = 1; i < n; i++) {
            // Update minimum price if found
            minPrice = Math.min(minPrice, prices[i]);
            // max profit if we sell on ith day 
            dp[i] = Math.max(dp[i - 1], prices[i] - minPrice);
        }
        
        return dp[n - 1]; //last element 
    }
}