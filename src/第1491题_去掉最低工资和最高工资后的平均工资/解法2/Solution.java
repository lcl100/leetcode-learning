package 第1491题_去掉最低工资和最高工资后的平均工资.解法2;

import java.util.Arrays;

public class Solution {
    public double average(int[] salary) {
        // 1.排序，排序后最低工资是数组中第一个数，最高工资是数组中最后一个数
        Arrays.sort(salary);
        // 2.计算总工资
        int sumSalary = 0;
        for (int i = 0; i < salary.length; i++) {
            sumSalary += salary[i];
        }
        // 3.返回去掉最低工资和最高工资后的平均工资
        return (double) (sumSalary - salary[0] - salary[salary.length - 1]) / (salary.length - 2);
    }
}
/*
    解题思路：
        0.排序
        1.排序，排序后最低工资是数组中第一个数，最高工资是数组中最后一个数
        2.循环遍历salary数组，计算总工资
        3.返回去掉最低工资和最高工资后的平均工资
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36.2 MB, 在所有 Java 提交中击败了52.67% 的用户
 */