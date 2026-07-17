class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rowHasNumber = new boolean[9][9];
        boolean[][] columnHasNumber = new boolean[9][9];
        boolean[][] subBoxHasNumber = new boolean[9][9];
        for(int i =0;i<9;i++){
            for(int j= 0;j<9;j++){
                if(board[i][j]=='.')continue;
                    int num = board[i][j]-'0'-1;
                    int subBoxIndex = (i / 3) * 3 + (j / 3);
                    if(rowHasNumber[i][num]|| columnHasNumber[j][num]||subBoxHasNumber[subBoxIndex][num]){
                        return false;
                    }
                    rowHasNumber[i][num]=true;
                    columnHasNumber[j][num]=true;
                    subBoxHasNumber[subBoxIndex][num]=true;
            }
        }
        return true;
    }
}
