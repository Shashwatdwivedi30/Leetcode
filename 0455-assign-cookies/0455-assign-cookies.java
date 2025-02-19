class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int l1 = g.length;
        int l2 = s.length;
        int i = 0, j = 0, res = 0;
        while(l1 > i && l2 > j){
            if(s[j] >= g[i]){
                res++;
                i++;
                j++;
            }
            else if(g[i] > s[j]){
                j++;
            }
        }
        return res;
    }
}