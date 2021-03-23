package 第1523题_在区间范围内统计奇数数目.解法2;

class Solution {
    public int countOdds(int low, int high) {
        int oddCount = 0;
        if (low % 2 == 0) {
            low++;
        }
        while (low <= high) {
            oddCount++;
            low += 2;
        }
        return oddCount;
    }
}
/*
    解题思路：
        0.计数
        1.直接跳到奇数位置进行计数统计
    总结：
        1.仍然耗时严重
 */
/*
    执行用时：681 ms, 在所有 Java 提交中击败了5.12% 的用户
    内存消耗：35.4 MB, 在所有 Java 提交中击败了8.46% 的用户
 */