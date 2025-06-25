class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] prefix = new int[1002];

        for(int[] curr : trips){
            int passenger = curr[0];
            int currstart = curr[1];
            int currend = curr[2];

            prefix[currstart] += passenger;
            prefix[currend] -= passenger;
        }
        int load = 0;
        for(int i = 1;i < 1002; i++){
            load += prefix[i-1];    
            if(load > capacity) return false;    
        }
        return true;
    }
}