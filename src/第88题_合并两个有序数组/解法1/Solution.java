package 第88题_合并两个有序数组.解法1;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 将num2合并到num1中
        for (int i = m, j = 0; i < nums1.length; i++, j++) {
            nums1[i] = nums2[j];
        }
        // [1,2,3,2,5,6]
        for (int i = m; i < nums1.length; i++) {
            for (int q = 0; q < i + 1; q++) {
                if (nums1[i] < nums1[q]) {
                    int temp = nums1[i];
                    nums1[i] = nums1[q];
                    nums1[q] = temp;
                }
            }
        }
    }
}
/*
    执行用时：2 ms, 在所有 Java 提交中击败了22.52% 的用户
    内存消耗：38.7 MB, 在所有 Java 提交中击败了17.45% 的用户
 */