class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][j] = -999; 
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -999) {
                    change(matrix, i, j);
                }
            }
        }
    }

    public static void change(int[][] matrix, int i, int j) {
        int m = matrix.length, n = matrix[0].length;

        for (int a = 0; a < n; a++) { 
            if (matrix[i][a] != -999) matrix[i][a] = 0;
        }

        for (int a = 0; a < m; a++) { 
            if (matrix[a][j] != -999) matrix[a][j] = 0;
        }


        matrix[i][j] = 0;
    }
}
