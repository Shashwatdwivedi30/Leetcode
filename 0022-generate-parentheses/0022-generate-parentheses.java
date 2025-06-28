class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        GenParenthesis(n, 0, 0, "", ans);
        return ans;
    }

    public static void GenParenthesis(int n, int open, int close, String ans, List<String> ll){
        if(open == n && close == n){
            ll.add(ans);
            return;
        }
        if(open < n){ 
            GenParenthesis(n, open+1,close, ans+"(", ll);
        }
        if(close < open){ 
            GenParenthesis(n, open,close+1, ans+")", ll);
        }
    }
}