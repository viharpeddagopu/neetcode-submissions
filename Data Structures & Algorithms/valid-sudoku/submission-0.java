class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Create 2D arrays to track seen numbers
        // seenRow[0][4] means "in row 0, have we seen the number 5?"
        boolean[][] seenRow = new boolean[9][9];
        boolean[][] seenCol = new boolean[9][9];
        boolean[][] seenBox = new boolean[9][9];

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                
                // Skip empty cells
                if (board[r][c] == '.') {
                    continue;
                }

                // Convert char '1'-'9' to integer index 0-8
                int val = board[r][c] - '1'; 
                
                // Calculate which of the 9 boxes we are currently in (0 to 8)
                int boxIndex = (r / 3) * 3 + (c / 3);

                // If we have already seen this number in the current row, col, or box -> Invalid
                if (seenRow[r][val] || seenCol[c][val] || seenBox[boxIndex][val]) {
                    return false;
                }

                // Mark the number as seen
                seenRow[r][val] = true;
                seenCol[c][val] = true;
                seenBox[boxIndex][val] = true;
            }
        }
        
        return true;
    }
}