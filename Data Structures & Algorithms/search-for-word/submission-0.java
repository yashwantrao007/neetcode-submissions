class Solution {
    public boolean exist(char[][] board, String word) {

    char[] charArc = word.toCharArray();

    int m = board.length;
    int n = board[0].length;

    for(int i = 0; i<m; i++){
        for(int j = 0; j<n; j++){
            if(dfs(i,j,board, charArc, 0)){
                return true;
            }
        }
    }
    return false; 
    }
    public boolean dfs( int i, int j, char[][] board,char[] charArc, int index){

        if(index == charArc.length) return true;

        if(i<0 || j<0 || i>= board.length || j>=board[0].length || board[i][j] != charArc[index]){
            return false;
        }

        char charw = board[i][j];

        board[i][j] = '*';
        boolean result = dfs(i+1,j, board,charArc, index+1) || dfs(i,j+1, board,charArc, index+1) || dfs(i-1,j,board,charArc,index+1) || dfs(i,j-1,board,charArc,index+1);
        board[i][j] = charw;

        return result;
        
    }
}
