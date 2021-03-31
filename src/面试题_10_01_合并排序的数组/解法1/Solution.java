package 面试题_10_01_合并排序的数组.解法1;

import java.util.Arrays;

class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
        // 1.将B中的元素添加到A中
        int j = 0;// 指针，指向B数组中的元素
        for (int i = m; i < A.length; i++) {
            A[i] = B[j];
            j++;
        }
        // 2.调用API排序
        Arrays.sort(A);
    }
}
/*
    解题思路：
        0.API排序
        1.将数组B中的所有元素添加到A中m索引处的位置
        2.然后对数组A调用Arrays的API进行排序
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了30.26% 的用户
    内存消耗：38.4 MB, 在所有 Java 提交中击败了74.40% 的用户
 */