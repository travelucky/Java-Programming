import java.util.Scanner;

public class CompoundValueCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 提示用户输入每月储蓄金额
        System.out.print("Enter the monthly saving amount: $");
        double savings = input.nextDouble();

        // 初始账户价值为0
        double accountValue = 0;
        final double MONTHLY_INTEREST_RATE = 0.00417; // 年利率5%的月利率

        // 计算6个月后的账户价值
        for (int month = 1; month <= 6; month++) {
            accountValue += savings;
            accountValue *= (1 + MONTHLY_INTEREST_RATE);
        }

        // 显示结果
        System.out.printf("After the sixth month, the account value is $%.2f\n", accountValue);

        input.close();
    }
}
