import java.util.Random;

public class Task13 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random random = new Random();

        // 随机填充0s和1s到矩阵中
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = random.nextInt(2);
            }
        }

        // 打印矩阵
        System.out.println("Matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        // 找出第一行和列中拥有最多1的索引
        int maxRow = -1;
        int maxColumn = -1;
        int maxOnesInRow = Integer.MIN_VALUE;
        int maxOnesInColumn = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++) {
            int onesInRow = 0;
            int onesInColumn = 0;
            for (int j = 0; j < 4; j++) {
                if (matrix[i][j] == 1) {
                    onesInRow++;
                }
                if (matrix[j][i] == 1) {
                    onesInColumn++;
                }
            }
            if (onesInRow > maxOnesInRow) {
                maxOnesInRow = onesInRow;
                maxRow = i;
            }
            if (onesInColumn > maxOnesInColumn) {
                maxOnesInColumn = onesInColumn;
                maxColumn = i;
            }
        }

        // 输出结果
        System.out.println("\nThe largest row index: " + maxRow);
        System.out.println("The largest column index: " + maxColumn);
    }
}
