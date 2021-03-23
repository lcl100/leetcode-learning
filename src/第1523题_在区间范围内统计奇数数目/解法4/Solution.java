package 第1523题_在区间范围内统计奇数数目.解法4;

public class Solution {
    public int countOdds(int low, int high) {
        return (high + 1) >> 1 - low >> 1;
    }
}
/*
    解题思路：
        0.代码来自于官方的题解：https://leetcode-cn.com/problems/count-odd-numbers-in-an-interval-range/solution/zai-qu-jian-fan-wei-nei-tong-ji-qi-shu-shu-mu-by-l/
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：35.3 MB, 在所有 Java 提交中击败了24.72% 的用户
 */