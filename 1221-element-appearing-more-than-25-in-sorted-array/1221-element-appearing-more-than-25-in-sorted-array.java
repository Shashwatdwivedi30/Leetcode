class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int max = 0;
        for(int key : map.keySet()){
            if(map.get(key) > arr.length / 4){
                return key;
            }
        }
        return -1;
    }
}