class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int c = 0;
        int candidate = nums[0];
        for(int i = 0; i < n; i++){
            if(c == 0){
                c = 1;
                candidate = nums[i];
            }
            else{
                if(candidate == nums[i]){
                    c++;
                }
                else{
                    c--;
                }
            }
        }
        return candidate;
    }
}