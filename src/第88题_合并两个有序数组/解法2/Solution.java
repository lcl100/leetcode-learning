package 第88题_合并两个有序数组.解法2;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int result[] = new int[m + n];
        // 1.新建一个长度为m+n的新数组result，新建三根指针i、j和k，其中i指向nums1数组中的元素下标，j指向nums2数组的下标，而k指向result新数组的下标
        int i = 0, j = 0, k = 0;
        // 2.使用双指针i和j循环遍历num1数组和nums2数组中的元素
        while (i < nums1.length - n && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                // 下面代码等价于：result[k++]=nums1[i++];
                result[k] = nums1[i];
                i++;
                k++;
            } else if (nums1[i] == nums2[j]) {
                // 下面代码等价于：result[k++]=nums1[i++]
                result[k] = nums1[i];
                k++;
                i++;
                // 下面代码等价于：result[k++]=nums2[j++]
                result[k] = nums2[j];
                k++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                // 下面代码等价于：result[k++]=nums2[j++]
                result[k] = nums2[j];
                j++;
                k++;
            }
        }
        // 3.如果nums1中还有剩余元素，那么添加到result数组中；如果nums2中还有剩余元素，那么添加到result数组中
        while (i < nums1.length - n) {
            result[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2.length) {
            result[k] = nums2[j];
            j++;
            k++;
        }
        // 4.最后将result数组中所有元素覆盖原nums1数组，因为要求是改变nums1数组元素
        for (int q = 0; q < result.length; q++) {
            nums1[q] = result[q];
        }
    }
}
/*
    解题思路：
        0.双指针
        1.新建一个长度为m+n的新数组result，新建三根指针i、j和k，其中i指向nums1数组中的元素下标，j指向nums2数组的下标，而k指向result新数组的下标
        2.使用双指针i和j循环遍历num1数组和nums2数组中的元素
            2.1比较双指针所指向的元素的大小
                2.1.1如果nums1[i]小于nums2[j]，表示nums1[i]应该在nums2[j]之前，将nums1[i]装入result新数组，并且i和k指针都向前移动一个位置，而j指针不变
                2.1.2如果nums1[i]等于nums2[j]，表示nums1[i]和nums2[j]无论谁在前都可以，所以将nums1[i]装入result新数组并且i和k指针向前移动一个位置，再将nums2[j]也装入result数组并且j和k指针向前移动一个位置
                2.1.3如果nums1[i]大于nums2[j]，表示nums2[j]应该在nums[i]之前，将nums2[j]装入result新数组，并且j和k指针都向前移动一个位置，而i指针不变
        3.如果nums1中还有剩余元素，那么添加到result数组中；如果nums2中还有剩余元素，那么添加到result数组中
        4.最后将result数组中所有元素覆盖原nums1数组，因为要求是改变nums1数组元素
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：38.7 MB, 在所有 Java 提交中击败了22.26% 的用户
 */