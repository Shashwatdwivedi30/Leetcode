class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int t = 0;
        int[] a = new int[n*n];
        for(int i=0; i<n; i++){
            for(int j = 0; j < n; j++){
                a[t++] = matrix[i][j];
            }
        }
        Arrays.sort(a);
        return a[k-1];
    }
}