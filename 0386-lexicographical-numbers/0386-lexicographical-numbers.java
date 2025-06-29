class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> al = new ArrayList<>();
        for(int i = 1; i <= 9 && i <= n; i++){ 
            Counting(n, i, al);
        }
        return al;
    }
    public void Counting(int n, int curr,List<Integer> al){
        al.add(curr);
        for(int i = 0; i <= 9; i++){   
            int next = curr*10+i;   
            if(next > n) break;   
            Counting(n, next, al);
        }
    }
}