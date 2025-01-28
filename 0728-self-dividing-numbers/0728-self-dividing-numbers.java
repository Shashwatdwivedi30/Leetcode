class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = left; i <= right; i++){
            if(SelfDivide(i)){ 
                al.add(i);
            }
        }
        return al;
    }
    public boolean SelfDivide(int n){
        int n1 = n;
        while(n>0){
           int d = n%10;
            n/=10;
            if(d == 0 || n1 % d != 0) return false;
        }
        return true;
    }
}