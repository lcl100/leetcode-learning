package 第905题_按奇偶排序数组.解法3;

import java.util.Arrays;

public class Solution {
    public int[] sortArrayByParity(int[] A) {
        // 将int[]数组重装为Integer[]数组
        Integer[] newA = new Integer[A.length];
        for (int i = 0; i < A.length; i++) {
            newA[i] = A[i];
        }

        // 排序
        Arrays.sort(newA, (a, b) -> Integer.compare(a % 2, b % 2));

        // 将Integer[]数组重装为int[]数组
        for (int i = 0; i < newA.length; i++) {
            A[i] = newA[i];
        }
        return A;
    }
}
/*
    解题思路：
        0.排序
    注：
        1.代码来源于官方题解实现
 */
/*
    执行用时：8 ms, 在所有 Java 提交中击败了6.97% 的用户
    内存消耗：39.6 MB, 在所有 Java 提交中击败了6.59% 的用户
 */