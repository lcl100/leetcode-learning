package 第1323题_6和9组成的最大数字.解法2;

public class Solution {
    public int maximum69Number(int num) {
        if (num / 1000 == 6) {
            return num + 3000;
        } else if ((num / 100) % 10 == 6) {
            return num + 300;
        } else if ((num / 10) % 10 == 6) {
            return num + 30;
        } else if (num % 10 == 6) {
            return num + 3;
        } else {
            return num;
        }
    }
}
/*
    解题思路：
        0.指定范围判断
        1.由于在题目中给定了num的范围：1<=num<=10^4，所以直接判断即可
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：35 MB, 在所有 Java 提交中击败了95.14% 的用户
 */