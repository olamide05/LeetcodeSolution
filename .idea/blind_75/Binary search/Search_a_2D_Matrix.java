class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;               // Number of rows in the matrix
        int cols = matrix[0].length;             // Number of columns in the matrix
        int l = 0;
        int r = rows * cols - 1;                 // Flatten the matrix into a 1D range

        while (l <= r) {
            int middle = l + (r - l) / 2;       // Correct way to calculate middle
            int row = middle / cols;             // Find the row index
            int col = middle % cols;             // Find the column index

            if (matrix[row][col] == target) {
                return true;                    // Target found
            } else if (matrix[row][col] < target) {
                l = middle + 1;                 // Move right
            } else {
                r = middle - 1;                 // Move left
            }
        }

        return false;                             // Target not found
    }
}

