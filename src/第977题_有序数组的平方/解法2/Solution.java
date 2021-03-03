package 第977题_有序数组的平方.解法2;

import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] A) {
        // 1.将数组元素都改造成绝对值
        for (int i = 0; i < A.length; i++) {
            A[i]=A[i]>0 ? A[i] : -A[i];
        }

        // 2.对数组元素进行排序
        Arrays.sort(A);

        // 3.平方
        for (int i=0;i<A.length;i++) {
            A[i]=A[i]*A[i];
        }
        return A;
    }
}
/**
 * 思路：
 * 同解法1不同的是，解法1是先平方，再排序。
 * 本解法是先绝对值，再排序，最后平方。按值绝对值的大小进行排序
 */
