package leetcode;

import java.util.HashSet;

/**
 * @Author: LiuYafei
 * @Date: 2017/10/31
 * @Time: 20:38
 * @Description:
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++ ) {
            HashSet<Character> rows = new HashSet<>();
            HashSet<Character> columns = new HashSet<>();
            HashSet<Character> cube = new HashSet<>();
            for(int j = 0; j < 9; j++ ) {
                if (board[i][j] != '.' && !rows.add(board[i][j])) {
                    return false;
                }
                if (board[j][i] != '.' && !columns.add(board[j][i])) {
                    return false;
                }
                //r和c控制cube的左上角坐标
                int r = 3 * (i / 3);
                int c = 3 * (i % 3);
                if(board[r + j / 3][c + j % 3] != '.' && !cube.add(board[r + j / 3][c + j % 3])) {
                    return false;
                }
            }
        }
        return true;
    }
}
