class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int rotated [][] = new int [n][n];

        for(int rows = 0; rows < n; rows++){
            for(int cols = 0; cols < n; cols++){
                rotated[cols][n - 1 - rows] = matrix[rows][cols];
            }
        }

        for(int rows = 0; rows < n; rows++){
            for(int cols = 0; cols < n; cols++){
                matrix[rows][cols] = rotated[rows][cols];
            }
        }
    }
}