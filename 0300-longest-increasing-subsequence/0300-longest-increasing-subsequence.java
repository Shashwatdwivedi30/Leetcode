class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] temp = new int[nums.length];
        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j]){
                    if(temp[j] + 1 > temp[i]){
                        temp[i] = temp[j] + 1;
                    }
                }
            }
        }
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(temp[i] > max){
                max = temp[i];
            }
        }
        return max+1;
    }
}