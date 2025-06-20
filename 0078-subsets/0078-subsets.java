class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> al = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(nums, al, 0, list);
        return al;
    }

    public void solve(int[] arr, List<List<Integer>> al, int i, List<Integer> list){
        if(i >= arr.length){
            al.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[i]);
        solve(arr, al, i+1, list);
        list.remove(list.size()-1);

        solve(arr, al, i+1, list);
    }
}