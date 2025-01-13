import java.util.*;
class Solution {
    public int minimumLength(String s) {
        int[] freq = new int[26];
        int x = 0;
        for(int i = 0; i < s.length() ; ++i){
            freq[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < freq.length; i++){
           if(freq[i] == 0) continue;
           if(freq[i]%2 == 0){
             x+=2;
           }
           else{
             x++;
           }
        }
        return x;
    }
}