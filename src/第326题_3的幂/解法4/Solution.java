package 第326题_3的幂.解法4;

public class Solution {
    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
}
/*
    解题思路：
        0.数学
        1.题中n的范围是-2^31 <= n <= 2^31 - 1，而在这个范围内3的最大幂是1162261467，在比他大就超过int表示的范围了，我们直接用它对n求余即可，过求余的结果是0，说明n是3的幂次方
        2.代码和思路来源于官方题解的方法：https://leetcode-cn.com/problems/power-of-three/solution/3de-mi-by-leetcode/
 */
/*
    执行用时：15 ms, 在所有 Java 提交中击败了99.23% 的用户
    内存消耗：38.2 MB, 在所有 Java 提交中击败了70.65% 的用户
 */