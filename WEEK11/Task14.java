import java.util.Arrays;
import java.util.Random;

public class Task14 {

    public static void main(String[] args) {
        // 初始化矩阵
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

        // 打印原始矩阵
        System.out.println("Original matrix:");
        printMatrix(m);

        // 调用shuffle方法进行行打乱
        shuffle(m);

        // 打印打乱后的矩阵
        System.out.println("\nShuffled matrix:");
        printMatrix(m);
    }

    public static void shuffle(int[][] m) {
        Random rand = new Random();
        for (int i = m.length - 1; i > 0; i--) {
            // 生成[0,i]之间的随机索引
            int index = rand.nextInt(i + 1);
            // 交换m[i]和m[index]
            int[] temp = m[i];
            m[i] = m[index];
            m[index] = temp;
        }
    }


    public static void printMatrix(int[][] m) {
        for (int[] row : m) {
            System.out.println(Arrays.toString(row));
        }
    }
}
