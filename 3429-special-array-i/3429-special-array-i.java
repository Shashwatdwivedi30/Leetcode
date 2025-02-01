class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length < 1){
            return true;
        }
        int i = 0;
        int j = i+1;
        while(j<=nums.length-1){ 
            if(nums[i]%2==0 && nums[j]%2==0 || nums[i]%2!=0 && nums[j]%2!=0){
                return false;
           }
           i++;
           j++;
        }
        return true;
    }
}