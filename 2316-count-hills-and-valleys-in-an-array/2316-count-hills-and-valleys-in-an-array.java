class Solution {
    public int countHillValley(int[] nums) {
        int i = 0;
        int c = 0;
        for(int j = 1; j < nums.length-1;j++){
            if(nums[i] < nums[j] && nums[j] > nums[j+1]){
                c++;
                i=j;
            }
            else if(nums[i] > nums[j] && nums[j] < nums[j+1]){
                c++;
                i=j;
            }
        }
        return c;
    }
}