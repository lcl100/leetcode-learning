package 第977题_有序数组的平方.解法1;

import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] A) {
        // 1.将数组每个元素平方
        for (int i = 0; i < A.length; i++) {
            A[i] *= A[i];
        }
        // 2.将数组排序
        Arrays.sort(A);
        return A;
    }
}
/*
    解题思路：
        0.排序
        1.将数组中每个元素替换为它的平方数
        2.对新数组排序
 */
/*
    执行用时：2 ms, 在所有 Java 提交中击败了62.80% 的用户
    内存消耗：40.5 MB, 在所有 Java 提交中击败了11.07% 的用户
 */