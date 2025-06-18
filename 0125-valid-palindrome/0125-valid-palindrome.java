class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();
        if(sb.toString().equals(s1)){
            return true;
        }
        else{
            return false;
        }
    }
}