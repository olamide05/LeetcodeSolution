public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();

        for(int row = 0; row <9; row++){
            for(int col = 0; col<9; col++){
                if(board[row][col]== '.'){
                    continue;
                }
                String squareKey = (row/3) +","+(col/3);
                if (rows.computeIfAbsent(row, k -> new HashSet<>()).contains(board[row][col]) ||
                        cols.computeIfAbsent(col, k -> new HashSet<>()).contains(board[row][col]) ||
                        squares.computeIfAbsent(squareKey, k -> new HashSet<>()).contains(board[row][col])) {
                    return false;
                }

                rows.get(row).add(board[row][col]);
                cols.get(col).add(board[row][col]);
                squares.get(squareKey).add(board[row][col]);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        char[][] board =
[["1","2",".",".","3",".",".",".","."],
 ["4",".",".","5",".",".",".",".","."],
 [".","9","8",".",".",".",".",".","3"],
 ["5",".",".",".","6",".",".",".","4"],
 [".",".",".","8",".","3",".",".","5"],
 ["7",".",".",".","2",".",".",".","6"],
 [".",".",".",".",".",".","2",".","."],
 [".",".",".","4","1","9",".",".","8"],
 [".",".",".",".","8",".",".","7","9"]]

System.out.println(isValidSudoku(board))
    }
}



