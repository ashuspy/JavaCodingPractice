package SDE_SHeet;

public class ZeroMatrix {
    public static void setZeros(int matrix[][]) {

        int col0 = 1, rows = matrix.length, cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) col0 = 0;
            for (int j = 1; j < cols; j++)
                if (matrix[i][j] == 0)
                    matrix[i][0] = matrix[0][j] = 0;
        }

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 1; j--)
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            if (col0 == 0) matrix[i][0] = 0;
        }
    }
    public static void printMatrix(int mat[][], int R,
                                   int C)
    {
        int i, j;
        for (i = 0; i < R; i++) {
            for (j = 0; j < C; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int mat[][] = {
                { 1, 1, 1, 1 },
                { 1, 0, 1, 1 },
                { 1, 1, 1, 1 },
        };

        System.out.println("Matrix Initially");
        printMatrix(mat, 3, 4);
        setZeros(mat);
        System.out.println("Matrix after modification n");
        printMatrix(mat, 3, 4);
    }
}
