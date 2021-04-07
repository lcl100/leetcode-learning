package 第81题_搜索旋转排序数组II.解法2;

import java.util.Arrays;

public class Solution {
    public boolean search(int[] nums, int target) {
        // 对数组排序，恢复有序
        Arrays.sort(nums);
        // 二分查找
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            }
        }
        return false;
    }
}
/*
    解题思路：
        0.排序+二分查找
        1.先对数组进行排序
        2.数组有序才能二分查找目标数target是否存在
    特别注意：
        1.本题是经过旋转使原有序数组无序的，所以排序也有些违背题意的意思
 */
/*
    执行用时：2 ms, 在所有 Java 提交中击败了88.78% 的用户
    内存消耗：38.2 MB, 在所有 Java 提交中击败了59.09% 的用户
 */
