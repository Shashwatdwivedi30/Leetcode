class Solution {
    public int findClosestNumber(int[] nums) {
        int c = Integer.MAX_VALUE;
        int ans = 0;
        int idx = 0;
        for(int i = 0; i < nums.length; i++){
            int n = Math.abs(nums[i]-0);
            if(c == n){
                if(nums[i] > nums[idx]){
                    idx = i;
                }
                
            }
            if(n < c){
                c = n;
                idx = i;
                
            }
        }
        return nums[idx];
    }
}