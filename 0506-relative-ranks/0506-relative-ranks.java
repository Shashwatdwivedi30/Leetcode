class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int l = score.length;
        for(int i = 0; i < l; i++){
            map.put(score[i], i);
        }
        Arrays.sort(score);
        String[] res = new String[l];
        for(int i = score.length-1; i >= 0; i--){
            if(i == l-1){
                res[map.get(score[i])] = "Gold Medal";
            }
            else if(i == l-2){
                res[map.get(score[i])] = "Silver Medal";
            }
            else if(i == l-3){
                res[map.get(score[i])] = "Bronze Medal";
            }
            else{
                res[map.get(score[i])] = Integer.toString(l-i);
            }
        }
        return res;
    }
}