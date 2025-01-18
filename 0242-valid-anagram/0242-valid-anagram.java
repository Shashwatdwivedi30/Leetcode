class Solution {
    public boolean isAnagram(String s, String t) {
        int c = 0;
        int[] s1 = new int[26];
        int[] t1 = new int[26];
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            s1[s.charAt(i) - 'a']++;
            t1[t.charAt(i) - 'a']++;
        }
        for(int i = 0; i < s1.length; i++){
            if(s1[i] == t1[i]){
                c++;
            }
        }
        if(c == s1.length){
            return true;
        }
        return false;
    }
}