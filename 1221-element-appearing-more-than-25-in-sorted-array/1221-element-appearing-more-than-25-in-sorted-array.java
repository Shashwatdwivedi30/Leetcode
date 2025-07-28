class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int[] freq = new int[arr[n-1] + 1];
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > n / 4) {
                return i;
            }
        }
        return -1;
    }
}