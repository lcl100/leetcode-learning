package 第977题_有序数组的平方.解法2;

import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] A) {
        // 1.将数组元素都改造成绝对值
        for (int i = 0; i < A.length; i++) {
            A[i] = Math.abs(A[i]);
        }

        // 2.对数组元素进行排序
        Arrays.sort(A);

        // 3.平方
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        return A;
    }
}
/*
    解题思路：
        0.排序
        1.先将每个数替换为它的绝对值数
        2.对数组排序
        3.对数组中每个数替换为它的平方数
 */
/*
    执行用时：2 ms, 在所有 Java 提交中击败了62.80% 的用户
    内存消耗：40.2 MB, 在所有 Java 提交中击败了66.94% 的用户
 */