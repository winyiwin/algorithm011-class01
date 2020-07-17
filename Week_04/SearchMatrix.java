class Search {
  public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix ==null || matrix.length ==0 || (matrix.length == 1 && matrix[0].length ==0)) {
            return false;
        }

        int row = 0, col = matrix[0].length-1;
        while(row <= matrix.length-1 && col >=0) {

            if(target> matrix[row][col]) {
                row++;
            } else if(target < matrix[row][col]) {
                col--;
            } else {
                return true;
            }
        }
        return false;
    }


}
