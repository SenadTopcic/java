// Given Matrix, print column by column
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7},
                {8, 9, 0, 1, 2}
        };
        // find longest row length
        int max_length = 0;
        for (int[] row : matrix) {
            if (row.length > max_length) {
                max_length = row.length;
            }
        }
        // Printing column by column
        for (int col = 0; col < max_length; col++)
        {
            for (int[] row : matrix) {
                if (col < row.length) {
                    System.out.print(row[col] + " ");
                }
            }
            System.out.println();
        }
    }
}