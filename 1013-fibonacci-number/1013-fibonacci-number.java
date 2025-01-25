class Solution {
    public int fib(int n) {
        int result = 0;
        if(n < 2){
            return n;
        }
        while(n >= 0){
            return result + fib(n-2) + fib(n-1);
        }
        return 0;
    }
}