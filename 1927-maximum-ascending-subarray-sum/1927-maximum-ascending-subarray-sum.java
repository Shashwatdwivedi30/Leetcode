class Solution {
    public int maxAscendingSum(int[] nums) {
        int ans1 = nums[0], ans2 = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i-1]){
                ans1+=nums[i];
            }
            else{
                ans1 = nums[i];
            }
            ans2 = Math.max(ans2, ans1);
        }
        return ans2;
    }
}