package 第657题_机器人能否返回原点.解法4;

public class Solution {
    public boolean judgeCircle(String moves) {
        int uCount = 0, dCount = 0, lCount = 0, rCount = 0;
        char[] chars = moves.toCharArray();
        for (char aChar : chars) {
            if (aChar == 'U') {
                uCount++;
            } else if (aChar == 'D') {
                dCount++;
            } else if (aChar == 'L') {
                lCount++;
            } else if (aChar == 'R') {
                rCount++;
            }
        }
        return uCount == dCount && lCount == rCount;
    }
}
/*
    解题思路：
        0.变量计数
        1.解法2的优化
        2.由于变量个数确定，可以使用变量来计数
 */
/*
    执行用时：5 ms, 在所有 Java 提交中击败了92.86% 的用户
    内存消耗：38.7 MB, 在所有 Java 提交中击败了15.57% 的用户
 */