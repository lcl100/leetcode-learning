package 第258题_各位相加.解法2;

public class Solution {
    public int addDigits(int num) {
        // 如果num除以10不等于则一直循环，当num为一位数时，那么num/10==0，例如：4/10=0，12/10=1
        while (num / 10 != 0) {
            int sum = 0;// 计算num中各位数的和
            while (num > 0) {// 循环读取num中各位
                sum += num % 10;
                num /= 10;
            }
            // 将sum又赋给num，然后继续循环判断num是否是一个数
            num = sum;
        }
        return num;
    }
}
/*
    解题思路：
        1.利用取模和除法运算来计算每个数的每位的和
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：35.6 MB, 在所有 Java 提交中击败了48.78% 的用户
 */
