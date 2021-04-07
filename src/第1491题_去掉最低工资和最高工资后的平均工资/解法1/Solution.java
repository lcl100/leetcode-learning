package 第1491题_去掉最低工资和最高工资后的平均工资.解法1;

class Solution {
    public double average(int[] salary) {
        int minSalary = salary[0];// 最低工资
        int maxSalary = salary[0];// 最高工资
        int sumSalary = 0;// 总工资
        for (int i = 0; i < salary.length; i++) {
            minSalary = Math.min(minSalary, salary[i]);// 计算最低工资
            maxSalary = Math.max(maxSalary, salary[i]);// 计算最高工资
            sumSalary += salary[i];// 计算总工资
        }
        // 返回去掉最低工资和最高工资后的平均工资
        return (double) (sumSalary - minSalary - maxSalary) / (salary.length - 2);
    }
}
/*
    解题思路：
        0.暴力破解，单层for循环
        1.循环遍历salary数组，同时计算最高工资、最低工资和总工资
        2.最后返回(总工资-最高工资-最低工资)/(salary.length-2)
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36.3 MB, 在所有 Java 提交中击败了42.09% 的用户
 */