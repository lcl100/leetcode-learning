package 第961题_重复N次的元素.解法7;

public class Solution {
    public int repeatedNTimes(int[] A) {
        // 处理这种存在相邻元素相等的情况：[1,2,3,3]
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == A[i + 1]) {
                return A[i];
            }
        }
        // 处理这种情况：[2,1,2,5,3,2]
        if (A[0] == A[2] || A[0] == A[3]) {
            return A[0];
        }
        return A[1];
    }
}
/*
    解题思路：
        0.
    注：
        1.思路来源于https://leetcode-cn.com/problems/n-repeated-element-in-size-2n-array/solution/c4xing-dai-ma-yi-huo-yun-suan-by-yudou/
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：39.9 MB, 在所有 Java 提交中击败了5.27% 的用户
 */