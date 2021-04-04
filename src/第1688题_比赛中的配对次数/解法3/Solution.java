package 第1688题_比赛中的配对次数.解法3;

public class Solution {
    public int numberOfMatches(int n) {
        // 递归的终止条件
        if (n == 1) {
            return 0;
        }
        return n / 2 + numberOfMatches(n % 2 == 0 ? n / 2 : n / 2 + 1);// 如果n是偶数传入n/2，如果是奇数则传入n/2+1
    }
}
/*
    解题思路：
        0.递归
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：35.1 MB, 在所有 Java 提交中击败了77.97% 的用户
 */