import java.util.Random;

class Main {
    public static Random random = new Random();
    public static final int SIZE = 8;
    public static int[][] matrix = new int[SIZE][SIZE];
    public static int[][] variableRotateMatrix = new int[SIZE][SIZE];

    public static void main(String[] args) {

        matrixMethod(variableRotateMatrix);

    }

    public static int matrixMethod(int[][] x) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(256);
                System.out.format("%4d", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Матрица повернута на 90 градусов");
        int[][] a = variableRotateMatrix = matrix;
        for (int h = 0; h < variableRotateMatrix.length; h++) {
            for (int k = 0; k < variableRotateMatrix.length; k++) {
                System.out.format("%4d", variableRotateMatrix[variableRotateMatrix.length - k - 1][h]);
            }
            System.out.println();
        }
        return 0;
    }

}