class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> al = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        solve(nums, al, 0, list);
        return new ArrayList<>(al);
    }

    public void solve(int[] arr, Set<List<Integer>> al, int i, List<Integer> list){
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