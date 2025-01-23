class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int d1 = 0, tot = 0;
        if (start > destination) {
            int temp = start;
            start = destination;
            destination = temp;
        }
        for(int i = 0; i < distance.length; i++){
            if(i >= start && i < destination){
                d1+=distance[i];
            }
            tot+=distance[i];
        }
        return Math.min(d1,(tot-d1));
    }
}