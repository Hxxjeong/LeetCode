import java.util.*;

class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n+1];  // dp[i] = arr[0]부터 arr[i-1]까지의 최대 합 저장
        
        for (int i=1; i<=n; i++) {
            int subMax = 0;
            for (int j=1; j<=k && i-j>=0; j++) {
                subMax = Math.max(subMax, arr[i-j]);    // i부터 j개까지의 최대 원소
                dp[i] = Math.max(dp[i], dp[i-j] + subMax * j); // i부터 j까지의 최대 합
            }
        }
        
        return dp[n];
    }
}