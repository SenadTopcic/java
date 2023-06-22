import java.util.Scanner;

public class Main {

    static int[][] sumMatrix(int [][]matrix_1, int [][]matrix_2, int row, int column)
    {
        int matrix[][] =new int[row][column];
        for(int i = 0; i <row;i++)
        {
            for(int j = 0; j < column; j++)
            {
                matrix[i][j] = matrix_1[i][j] + matrix_2[i][j];
            }
        }
        return matrix;
    }

    static int[][] input_data_to_matrix(int row, int column)
    {
        Scanner sc = new Scanner(System.in);
        int matrix[][] =new int[row][column];
        for(int i = 0; i <row;i++)
        {
            for(int j = 0; j < column; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }
    static void print_matrix(int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter dimension of the Matrix");
        System.out.print("Number of Rows: ");
        int row_Matrix = sc.nextInt();
        System.out.print("Number of Columns: ");
        int column_Matrix = sc.nextInt();
        System.out.println("Please enter elements of Matrix_1");
        int[][] matrix_1 = input_data_to_matrix(row_Matrix, column_Matrix);
        System.out.println("Please enter elements of Matrix_2");
        int[][] matrix_2 = input_data_to_matrix(row_Matrix, column_Matrix);
        int[][] matrix_sum = sumMatrix(matrix_1, matrix_2, row_Matrix,column_Matrix);
        //print matrix
        System.out.println("Elements of the matrix_1 : ");
        print_matrix(matrix_1);
        System.out.println("Elements of the matrix_2 : ");
        print_matrix(matrix_2);
        System.out.println("Sum elements of matrix_1 and matrix_2 ");
        print_matrix(matrix_sum);
    }
}