class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> h = new HashSet<>();
        int c = 0;
        if(s.length() == 0) return 0;
        for(int i = 0; i < s.length(); i++){
            if(h.contains(s.charAt(i))){
                h.remove(s.charAt(i));
                c++;
            }
            else{
                h.add(s.charAt(i));
            }
        }
        if(!h.isEmpty()) return c*2+1;
        return c*2;
    }
}