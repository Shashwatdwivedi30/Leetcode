class Solution {
    public boolean isBalanced(String num) {
        int even_sum = 0, odd_sum = 0;
        for(int i = 0; i < num.length(); i++){
            int t = num.charAt(i) - '0';
            if(i%2 == 0){
                even_sum += t;
            }
            else{
                odd_sum += t;
            }
        }
        return odd_sum == even_sum;
    }
}