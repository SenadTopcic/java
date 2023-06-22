
/*
Problem Description
You are given a matrix A, you have to return an array containing sum of each row elements
 followed by sum of each column elements of the matrix.

NOTE: If the matrix given is of size (N x M), then the array you return would be of size (N + M), where first N elements contain the sum of
each N rows, and the next M elements contain the sum of each M columns.
* */

import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) {
        int[][] matrix_A = {
                {1, 2},
                {4, 5},
                {8, 9}
        };
        int row_m = matrix_A.length;
        int col_m = matrix_A[0].length;
        int[] matrix_sum = new int[col_m + row_m];
        int sumColumn = 0;
        int sumRow = 0;

        int index = 0;
        for (int row = 0; row < matrix_A.length; row++)
        {
            sumColumn = 0;
            for(int col = 0; col < matrix_A[0].length; col++)
            {
                sumColumn += matrix_A[row][col];
            }
            matrix_sum[index] = sumColumn;
            index++;
        }

        for (int col = 0; col < matrix_A[0].length; col++)
        {
            sumRow = 0;
            for(int row = 0 ; row < matrix_A.length; row++)
            {
                sumRow += matrix_A[row][col];
            }
            matrix_sum[index] = sumRow;
            index++;
        }
        for (int i = 0; i < matrix_sum.length; i++) {
            System.out.print(matrix_sum[i]);
            if (i < matrix_sum.length - 1) {
                System.out.print(", ");
            }
        }

    }

}