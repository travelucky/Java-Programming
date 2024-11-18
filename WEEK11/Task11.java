import java.util.Arrays;
import java.util.Comparator;

public class Task11 {
    public static void main(String[] args) {
        // 员工每周的工作小时数
        int[][] hours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}
        };

        // 创建一个EmployeeHour对象数组来存储员工编号和总工时
        EmployeeHour[] employeeHours = new EmployeeHour[hours.length];
        for (int i = 0; i < hours.length; i++) {
            int totalHours = 0;
            for (int j = 0; j < hours[i].length; j++) {
                totalHours += hours[i][j];
            }
            employeeHours[i] = new EmployeeHour(i, totalHours);
        }

        // 按总工时降序排序
        Arrays.sort(employeeHours, Comparator.comparing(EmployeeHour::getTotalHours).reversed());

        // 输出员工及其总工时
        for (EmployeeHour employeeHour : employeeHours) {
            System.out.println("Employee " + employeeHour.getEmployeeId() + " worked " + employeeHour.getTotalHours() + " hours in total.");
        }
    }

    // 一个简单的内部类来存储员工编号和总工时
    static class EmployeeHour {
        private int employeeId;
        private int totalHours;

        public EmployeeHour(int employeeId, int totalHours) {
            this.employeeId = employeeId;
            this.totalHours = totalHours;
        }

        public int getEmployeeId() {
            return employeeId;
        }

        public int getTotalHours() {
            return totalHours;
        }
    }

}
