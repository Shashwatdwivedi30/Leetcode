class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        GenParenthesis(n, 0, 0, "", ans);
        return ans;
    }

    public static void GenParenthesis(int n, int i, int j, String ans, List<String> ll){
        if(i == n && j == n){
            ll.add(ans);
        }
        if(i < n){
            GenParenthesis(n, i+1, j, ans+"(", ll);
        }
        if(j < i){
            GenParenthesis(n, i, j+1, ans+")", ll);
        }
    }
}