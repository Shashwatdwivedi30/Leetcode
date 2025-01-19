class Solution {
    public int[][] generateMatrix(int n) {
        if (n == 0) {
            return new int[0][0];
        }
        int[][] matrix = new int[n][n];
        int lr = 0;
        int top = 0;
        int rr = n-1;
        int bottom = n-1;
        int num = 1;
        while (lr <= rr && top <= bottom) {
            for (int i = lr; i <= rr; i++) {
                matrix[top][i] = num++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                matrix[i][rr] = num++;
            }
            rr--;
            if (top <= bottom) {
                for (int i = rr; i >= lr; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }
            if (lr <= rr) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][lr] = num++;
                }
                lr++;
            }
        }
        return matrix;
    }
}