class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Integer>> cols = new HashMap<>();
        HashMap<Integer, HashSet<Integer>> rows = new HashMap<>();
        HashMap<Integer, HashSet<Integer>> squares = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            rows.put(i, new HashSet<>());
            cols.put(i, new HashSet<>());
            squares.put(i, new HashSet<>());
        }
        
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') {
                    continue;
                }
                int square = (row / 3) * 3 + col / 3;
                HashSet rn = rows.get(row);
                HashSet cn = cols.get(col);
                HashSet sn = squares.get(square);

                if (rn.contains(board[row][col]) || 
                    cn.contains(board[row][col]) ||
                    sn.contains(board[row][col])) {
                        return false;
                }
                rn.add(board[row][col]);
                cn.add(board[row][col]);
                sn.add(board[row][col]);
            }
        }

        return true;
    }
}
