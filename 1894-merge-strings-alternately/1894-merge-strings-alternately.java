class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s = "";
        int p1 = 0;
        int p2 = 0;
        while(p1 < word1.length() && p2 < word2.length()){
            s+=word1.charAt(p1++);
            s+=word2.charAt(p2++);
        }
        if(p1 < word1.length()){
            while(p1 < word1.length()){ 
               s+=word1.charAt(p1++);
            }
        }
        if(p2 < word2.length()){
            while(p2 < word2.length()){ 
               s+=word2.charAt(p2++);
            }
        }
        return s;
    }
}