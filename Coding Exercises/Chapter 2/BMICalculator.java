import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 提示用户输入体重和身高
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double heightInInches = input.nextDouble();

        // 将英制单位转换为公制单位
        double weightInKilograms = weightInPounds * 0.45359237;
        double heightInMeters = heightInInches * 0.0254;

        // 计算BMI
        double bmi = weightInKilograms / (Math.pow(heightInMeters, 2));

        // 显示结果
        System.out.printf("BMI is %.5f\n", bmi);

        input.close();
    }
}
