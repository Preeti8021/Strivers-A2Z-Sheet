public class Fibonacci {
    public static long[] dp;
    public static long mod = 1000000007;
    
    static long topDown(int n) { //memoisation
        if (dp == null || dp.length < n + 1) {
            dp = new long[n+1];
        }
        
        if(n<=1){
            return n;
        }
        
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n] = (topDown(n-1) + topDown(n-2))%mod;
        return dp[n];
    }

    static long bottomUp(int n) { //tabulation
        dp = new long[n + 1];
        dp[0] = 0; 
        dp[1] = 1; 
        for(int i = 2; i<=n; i++){
            dp[i] = (dp[i-1]+dp[i-2])%mod;
        }
        return dp[n];
    }
}





Space Optimized - Tabulation approach
public static long bottomUp(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    int prev = 1;
    int prev2 = 0;
    int curr = -1;
    for(int i=2;i<=n;i++){
        curr = (prev + prev2)%mod;
        prev2 = prev;
        prev = curr;
    }
    return prev;
}
//tc - n,sc-n;
