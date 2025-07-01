class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        Permutation(candidates, target, ll, ans, 0);
        return ans;
    }

    public static void Permutation(int[] arr, int t,List<Integer> al,  List<List<Integer>> ans, int idx) {
        if(t == 0){
            ans.add(new ArrayList<>(al));
            return;
        }
        for(int i = idx; i < arr.length; i++){
            if(t >= arr[i]){
                al.add(arr[i]);
                Permutation(arr, t-arr[i], al, ans, i);
                al.remove(al.size() - 1);
            }
        }
    }
}