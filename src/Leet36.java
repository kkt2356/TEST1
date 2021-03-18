import java.util.HashSet;
import java.util.Set;

public class Leet36 {
    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(isValidSudoku(board));

    }

    static boolean isValidSudoku(char[][] board) {
        // 2차배열이므로 불가피하게 이중for문 사용
        // 중복검사에 대해서는 HashSet이 유용
        Set chk = new HashSet();
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                //하나의 요소를 가져옴
                char number = board[i][j];
                if(number != '.') {
                    if(!chk.add(number + " row " + i) || !chk.add(number + " aaa " + + j) || !chk.add(number + " row " + i/3 + "-" + j/3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
