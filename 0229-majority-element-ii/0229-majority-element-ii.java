class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        int freq = 1;
        int limit = nums.length/3;
        List<Integer> list = new ArrayList<>();
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                freq++;
            }
            else{
                if(freq > limit){
                    list.add(nums[i-1]);
                }
                freq = 1;
            }
        }
        if (freq > limit) {
            list.add(nums[nums.length - 1]);
        }
        return list;
    }
}