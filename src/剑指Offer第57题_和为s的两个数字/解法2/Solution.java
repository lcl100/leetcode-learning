package 剑指Offer第57题_和为s的两个数字.解法2;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int num : nums) {
            if (binSearch(nums, 0, nums.length - 1, target - num)) {
                return new int[]{num, target - num};
            }
        }
        return new int[]{};
    }

    // 二分查找，判断target是否在nums中存在，其中nums是待查找的数组，low是起始索引，high是结束索引，target是要查找的目标数
    private boolean binSearch(int[] nums, int low, int high, int target) {
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
        0.单层循环+二分查找
        1.使用单层循环nums数组中每个数，然后用target-num得到另外一个数，使用二分查找判断该数是否在nums数组中存在，如果存在则返回这一对数
 */
/*
    执行用时：44 ms, 在所有 Java 提交中击败了20.96% 的用户
    内存消耗：55.5 MB, 在所有 Java 提交中击败了44.72% 的用户
 */