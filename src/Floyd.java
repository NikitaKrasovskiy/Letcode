public class Foyd {
    private static final int inf = Integer.MAX_VALUE / 2;
    public static void main(String[] args) {


        int vNum = 5;
        int[][] mMatrix = new int[][] {    // A B C D E
                {0, inf, 5, inf, inf}, // A
                {7, 0, inf, inf, 10 }, // B
                {inf, 7, 0, inf, inf}, // C // матрица смежностей
                {inf, inf, 6, 0,  4 },// D
                {inf, inf, 1, inf, 0} // E
        };


        int[][] dist = new int[vNum][vNum]; // dist[i][j] = минимальное_расстояние(i, j)
        for (int i = 0; i < vNum; i++)  System.arraycopy(mMatrix[i], 0, dist[i],    0, vNum);
        for (int k = 0; k < vNum; k++)
            for (int i = 0; i < vNum; i++)
                for (int j = 0; j < vNum; j++)
                    dist[i][j] = Integer.min(dist[i][j], dist[i][k] + dist[k][j]);

        printMatrix(dist);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}