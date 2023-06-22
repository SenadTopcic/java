/*
*Matrix Transpose
Problem Description

You are given a matrix A, you have to return another matrix which is the transpose of A.

NOTE: Transpose of a matrix A is defined as - AT[i][j] = A[j][i] ;
*  Where 1 ≤ i ≤ col and 1 ≤ j ≤ row.

The tranpose of a matrix switches the element at (i, j)th index to (j, i)th index, and the
*  element at (j, i)th index to (i, j)th index.
* example
* int[][] matrix_A = { {1, 2, 3},{4, 5, 6},{7, 8, 9}};
*           // output [[1, 4, 7], [2, 5, 8], [3, 6, 9]]
int[][] matrix_B = { {1, 2},{1, 2},{1, 2}};
*         // output [[1, 1, 1], [2, 2, 2]]
* */

public class Main {
    public static void main(String[] args) {
        int[][] matrix_A = {
                {52, 4, 60, 79, 13, 45, 100, 72},
                {54, 57, 96, 89, 2, 93, 19, 66},
                {29, 33, 4, 88, 69, 93, 19, 7},
                {82, 14, 16, 62, 29, 26, 60, 32},
                {81, 71, 63, 93, 15, 62, 17, 68},
                {70, 12, 57, 72, 56, 27, 89, 84},
                {11, 92, 24, 32, 36, 42, 90, 69},
                {7, 57, 31, 36, 82, 42, 19, 15},
                {12, 81, 7, 27, 94, 23, 94, 64}
        };
        int row_m = matrix_A.length;
        int col_m = matrix_A[0].length;
        int[][] matrix_AT = new int[col_m][row_m];
       // print_matrix(matrix_A);
        for (int row = 0; row < matrix_A.length; row++)
        {
            for(int col = 0; col < matrix_A[row].length; col++)
            {
                  matrix_AT[col][row] = matrix_A[row][col];
            }
        }
        print_matrix(matrix_AT);
    }

    static void print_matrix(int [][] matrix)
    {
        System.out.print("[ ");
        // Printing column by column
        for (int row = 0; row < matrix.length; row++)
        {
            System.out.print("[");
            for (int col = 0; col < matrix[row].length; col++)
            {
                System.out.print(matrix[row][col]);
            }
            System.out.print("]");
        }
        System.out.println(" ]");
    }
}