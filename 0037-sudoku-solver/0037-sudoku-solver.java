class Solution {
    public void solveSudoku(char[][] board) {
        boolean ans = solve(board);
        return;
    }
    public static boolean solve(char[][] board){
        for(int i =0 ; i < board.length; i++){
            for(int j = 0; j <board[0].length;j++){
                if(board[i][j] == '.'){
                    for(char ch = '1'; ch <= '9'; ch++){
                        if(isValid(i,j,ch,board)){
                            board[i][j] = ch;
                            if(solve(board)){
                                return true;
                            }
                            else{
                                board[i][j] = '.';
                            }
                        }
                    }
                    // if none of the char is filled
                    return false;
                }
            }
        }
        // will be here when whole board is filled
        return true;
    }
    public static boolean isValid(int row, int col, char c, char[][] board){
        //for rows
        for(int i = 0; i < 9; i++){
            if(board[row][i] == c) return false;
        }

        //for col
        for(int i = 0; i < 9; i++){
            if(board[i][col] == c) return false;
        }

        //for 3x3
        for(int i = 0; i < 9; i++){
            if(board[3*(row/3) + i/3][3*(col/3)+ i%3] == c) return false;
        }
        return true;
    }
}