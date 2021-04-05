package 第88题_合并两个有序数组.解法3;

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 将nums2数组合并到数组nums1中
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[i - m];
        }
        // 2.对nums1数组排序
        Arrays.sort(nums1);
    }
}
/*
    解题思路：
        0.排序
        1.由于题目中规定了nums1数组的长度大于m+n，所以将nums2数组合并到nums1数组中
        2.现在的nums1数组是乱序的，然后对nums1数组排序恢复顺序即可
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了22.52% 的用户
    内存消耗：38.9 MB, 在所有 Java 提交中击败了5.27% 的用户
 */