class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean status=true;
        for(int i=0;i<board.length;i++){
            if(!rowCheck(board,i)){
                return false;
            }
        }
        for(int i=0;i<board[0].length;i++){
            if(!colCheck(board,i)){
                return false;
            }
        }
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                if(!squareCheck(board,i,j)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean rowCheck(char [][] board, int row){
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<board[0].length;i++){
            if(set.contains(board[row][i])){
                return false;
            }else if(board[row][i]!='.'){
                set.add(board[row][i]);
            }
        }
        return true;
    }
    public boolean colCheck(char [][] board, int col){
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<board.length;i++){
            if(set.contains(board[i][col])){
                return false;
            }else if(board[i][col]!='.'){
                set.add(board[i][col]);
            }
        }
        return true;
    }
    public boolean squareCheck(char [][] board, int row,int col){
        HashSet<Character> set=new HashSet<>();
        for(int i=row;i<row+3;i++){
            for(int j=col;j<col+3;j++){
                if(set.contains(board[i][j])){
                    return false;
                }else if(board[i][j]!='.'){
                    set.add(board[i][j]);
                }
            }
        }
        return true;
    }
}