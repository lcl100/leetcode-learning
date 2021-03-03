package 第977题_有序数组的平方.解法1;

import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] A) {
        // 1.将数组每个元素平方
        for (int i = 0; i < A.length; i++) {
            A[i]*=A[i];
        }
        // 2.将数组排序
        Arrays.sort(A);
        return A;
    }
}
/**
 * 思路：
 * 先将每个元素平方，然后替换原值，再进行排序
 */