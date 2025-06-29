class Solution {
    static String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static List<String> letterCombinations(String digits) {
        List<String> al = new ArrayList<>();
        if(digits.length() == 0){
            return al;
        }
        Combination(digits, "", al);
        return al;
    }
    public static void Combination(String s, String ans, List<String> al){
        if(s.length() == 0){
            al.add(ans);
            return;
        }
        char ch = s.charAt(0);
        int num = ch - '0';
        String press = map[num];
        for(int i = 0; i < press.length(); i++){
            Combination(s.substring(1), ans + press.charAt(i), al);
        }
    }
}