class Solution {
   public void setZeroes(int[][] matrix) {
       List<int[]> positions = new ArrayList<>();
       int n = matrix.length;
       int m = matrix[0].length;


       // Store positions of zeros
       for (int i = 0; i < n; i++) {
           for (int j = 0; j < m; j++) {
               if (matrix[i][j] == 0) {
                   positions.add(new int[]{i, j});
               }
           }
       }


       // Set corresponding rows and columns to zero
       for (int[] pos : positions) {
           int x = pos[0], y = pos[1];


           // Set row to zero
           for (int i = 0; i < m; i++) {
               matrix[x][i] = 0;
           }


           // Set column to zero
           for (int i = 0; i < n; i++) {
               matrix[i][y] = 0;
           }
       }
   }
}



















