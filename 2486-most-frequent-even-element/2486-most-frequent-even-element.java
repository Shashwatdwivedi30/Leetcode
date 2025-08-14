class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i= 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            }
        }
        if(map.size() == 0){
            return -1;
        }
        int res = 0;
        int num = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > res){
                res = entry.getValue();
                num = entry.getKey();
            }
            else if(entry.getValue() == res){
                num = Math.min(entry.getKey(), num);
            }
        }
        return num;
    }
}