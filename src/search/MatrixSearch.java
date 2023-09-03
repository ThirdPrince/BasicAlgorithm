package search;

public class MatrixSearch {
    public static void main(String[] args) {

        int[][] matrix = {
                {1,4,7,11},
                {2,5,8,12},
                {3,6,9,16},
        };
        System.out.println(searchMatrix(matrix, 12));

    }

    public static boolean searchMatrix(int[][] matrix ,int target){
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = 0;
        int col = cols -1;

        while (row < rows && col >=0){
            int current = matrix[row][col];
            if(target == current){
             return  true;
            }else if(current > target){
             col--;
            }else {
             row ++;
            }
        }

        return false;



    }
}
