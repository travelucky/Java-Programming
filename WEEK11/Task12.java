import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        // 创建一个3x4的矩阵示例
        double[][] matrix = new double[3][4];
        Scanner sc = new Scanner(System.in);
        // 显示输入的矩阵
        System.out.println("Enter a 3-by-4 matrix row by row:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }

        // 计算每列的和并显示结果
        for (int columnIndex = 0; columnIndex < matrix[0].length; columnIndex++) {
            double sum = sumColumn(matrix, columnIndex);
            System.out.printf("Sum of the elements at column %d is %.1f%n", columnIndex, sum);
        }
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }
}
