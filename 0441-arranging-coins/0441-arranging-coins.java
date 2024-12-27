class Solution {
    public int arrangeCoins(int n) {
        long st = 1;
        long end = n;
        long ans = 0;
        long mid = 0;
        while(st <= end){
            mid = st + (end-st)/2;
            long coin = (mid*(mid+1))/2;
            if(coin <= n){
                ans = mid;
                st = mid+1;
            } else {
                end = mid-1;
            }
        }
        return (int)ans;
    }
}