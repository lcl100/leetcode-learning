package 第350题_两个数组的交集II.解法2;

import java.util.Arrays;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // 1.将两个数组排序，才能进行双指针比较
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        // 2.双指针比较
        int i = 0, j = 0;// 两根指针，i指向nums1数组元素索引，j指向nums2数组索引
        int[] result = new int[nums1.length > nums2.length ? nums2.length : nums1.length];// 表示结果数组
        int r = 0;// 指向result数组中元素的索引
        while (i < nums1.length && j < nums2.length) {
            // 如果nums1[i]小于nums2[j]，表示nums1[i]元素不够资格与nums2[j]比较，而nums2中不存在等于nums1[i]的元素
            while (i < nums1.length && j < nums2.length && nums1[i] < nums2[j]) {
                i++;// 所以指针前进
            }
            // 如果nums1[i]大于nums2[j]，表示nums2[j]元素不够资格与nums1[i]比较
            while (i < nums1.length && j < nums2.length && nums1[i] > nums2[j]) {
                j++;// 所以指针前进
            }
            // 执行到这，表示nums1[i]等于nums2[j]
            if (i < nums1.length && j < nums2.length && nums1[i] == nums2[j]) {
                // 那么将交集元素保存到result数组中
                result[r++] = nums1[i];
                // 同时i指针和j指针前进
                i++;
                j++;
            }
        }
        // 最后最需要返回result数组中前r个元素
        return Arrays.copyOf(result, r);
    }
}
/*
    解题思路：
        0.排序+双指针
 */
/*
    执行用时：2 ms, 在所有 Java 提交中击败了86.80% 的用户
    内存消耗：38.4 MB, 在所有 Java 提交中击败了89.98% 的用户
 */