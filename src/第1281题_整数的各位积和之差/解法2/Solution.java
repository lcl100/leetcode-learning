package 第1281题_整数的各位积和之差.解法2;

public class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;// 保存，各位数的积
        int sum = 0;// 保存，各位数的和
        while (n>0) {
            product *= n % 10;
            sum += n % 10;
            n /= 10;// 下一轮循环
        }
        return product - sum;
    }
}
/*
    解题思路：
        0.按位计算
        1.通过除以10得到每位数
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：35.2 MB, 在所有 Java 提交中击败了56.10% 的用户
 */