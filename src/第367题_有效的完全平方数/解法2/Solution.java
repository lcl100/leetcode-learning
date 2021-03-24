package 第367题_有效的完全平方数.解法2;

public class Solution {
    public boolean isPerfectSquare(int num) {
        int i = 1;
        while (Math.pow(i, 2) < num) {
            i++;
        }
        return Math.pow(i, 2) == num;
    }
}
/*
    解题思路：
        0.暴力破解，逐个数判断
 */
/*
    执行用时：3 ms, 在所有 Java 提交中击败了6.88% 的用户
    内存消耗：35.1 MB, 在所有 Java 提交中击败了73.11% 的用户
 */
