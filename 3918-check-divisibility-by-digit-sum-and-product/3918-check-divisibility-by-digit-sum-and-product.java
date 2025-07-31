class Solution {
    public boolean checkDivisibility(int n) {
        int prod = 1;
        int sum = 0;
        int t = n;
        while(n > 0){
            int d = n%10;
            prod *= d;
            sum += d;
            n /= 10;
        }
        System.out.println(prod+sum);
        return (t % (prod+sum) == 0);
    }
}