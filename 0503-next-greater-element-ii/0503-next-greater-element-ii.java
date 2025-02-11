class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        Stack<Integer> st = new Stack<>();
        Arrays.fill(res, -1);

        for(int i = 0; i < 2*n; i++){
            while(!st.isEmpty() && nums[st.peek()] < nums[i%n]){
                res[st.pop()] = nums[i%n];
            }
            st.push(i%n);
        }
        return res;
    }
}