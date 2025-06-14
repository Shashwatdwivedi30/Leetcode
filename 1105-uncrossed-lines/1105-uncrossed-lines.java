class Solution {
    private static int uncrossed(int[] arr1, int[] arr2){
        int m = arr1.length, n = arr2.length;
        int[][] dp = new int[m+1][n+1];
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(arr1[i-1] == arr2[j-1]){
                    dp[i][j] =  1 + dp[i-1][j-1]; 
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        return uncrossed(nums1, nums2);
    }
}