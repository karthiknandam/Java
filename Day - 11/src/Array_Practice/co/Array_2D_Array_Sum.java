package Array_Practice.co;

import java.util.Arrays;

public class Array_2D_Array_Sum {
    public static void main(String[] args) {

        int[][] matrix1 = {{1,2,3},
                {4,5,6}};
        int[][] matrix2 = {{2,4,5},
                {8,9,4}};
        int[][] result = {{0,0,0},
                {0,0,0}};
        for(int i = 0 ; i< matrix1.length ; i++ ){ //  Gets the rows
            for(int j = 0 ; j < matrix1[i].length ; j++  ){ //  Gets columns

                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println(Arrays.deepToString(result));
    }

}
//[[3, 6, 8], [12, 14, 10]]