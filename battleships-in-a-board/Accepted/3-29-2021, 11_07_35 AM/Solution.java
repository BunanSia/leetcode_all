// https://leetcode.com/problems/battleships-in-a-board

class Solution {
    int result;
    public int countBattleships(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]=='.')
                    continue;
                else if(i>0&&board[i-1][j]=='X')
                    continue;
                else if(j>0&&board[i][j-1]=='X')
                    continue;
                else                
                    result++;
            }
        }
        return result;
        }
    }