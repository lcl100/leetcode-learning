package 第896题_单调数列.解法2;

public class Solution {
    public boolean isMonotonic(int[] A) {
        int len = A.length;// 数组A的长度
        boolean flag1 = true;// 标志，单调递增的标志
        boolean flag2 = true;// 标志，单调递减的标志
        for (int i = 0; i < len - 1; i++) {
            if (A[i] > A[i + 1]) {
                flag1 = false;
            }
        }
        for (int i = 0; i < len - 1; i++) {
            if (A[i] < A[i + 1]) {
                flag2 = false;
            }
        }
        return flag1 || flag2;
    }
}
/*
    解题思路：
        0.两次循环
        1.不能清楚数组到底是递增数列还是递减数列，所以两遍循环，只要有一个为true就成功
 */
/*
    执行用时：3 ms, 在所有 Java 提交中击败了48.78% 的用户
    内存消耗：46.8 MB, 在所有 Java 提交中击败了65.07% 的用户
 */