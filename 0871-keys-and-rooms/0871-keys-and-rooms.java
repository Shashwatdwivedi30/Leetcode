class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] arr = new boolean[rooms.size()];
        Arrays.fill(arr, false);
        q.add(0);
        arr[0] = true;
        int c = 1;
        while(!q.isEmpty()){
            int curr= q.poll();
            for(int nbr: rooms.get(curr)){
                if(arr[nbr] == false){
                    arr[nbr] = true;
                    q.add(nbr);
                    c++;
                }
            }
        }
        return rooms.size() == c;
    }
}