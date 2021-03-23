package 第1281题_整数的各位积和之差.解法3;

public class Solution {
    public int subtractProductAndSum(int n) {
        String s = String.valueOf(n);
        int product = 1;// 保存，各位数的积
        int sum = 0;// 保存，各位数的和
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            int num1 = Integer.parseInt(s.charAt(i) + "");
            int num2 = Integer.parseInt(s.charAt(j) + "");
            product *= num1 * num2;
            sum += num1 + num2;
            if (i == j && num1 != 0) {
                product /= num1;
                sum -= num1;
            }
            i++;
            j--;
        }
        return product - sum;
    }
}
/*
    解题思路：
        0.解法1的优化
        1.本解法主要是为了优化解法1，循环的时候同时计算两个数，减少循环次数
        2.但提交后，发现效率并没有得到提升，反而下降了
 */
/*
    执行用时：8 ms, 在所有 Java 提交中击败了6.28% 的用户
    内存消耗：35.3 MB, 在所有 Java 提交中击败了40.61% 的用户
 */