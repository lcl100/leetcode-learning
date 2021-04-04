package 剑指Offer第53题I_在排序数组中查找数字.解法3;

class Solution {
    public int search(int[] nums, int target) {
        // 处理特殊情况：[1]和1
        if (nums.length == 1 && nums[0] == target) {
            return target;
        }
        // 双指针，分别向中间逼近
        int i = 0, j = nums.length - 1;
        while (i < j) {
            // i向后不断逼近target
            while (i < j && nums[i] != target) {
                i++;
            }
            // j向前不断逼近target
            while (i < j && nums[j] != target) {
                j--;
            }
            // 如果nums[i]和nums[j]都等于target，那么就表示已经找到了target
            if (nums[i] == target && nums[j] == target) {
                return j - i + 1;
            }
        }
        // 如果nums数组中不存在target元素，那么直接返回0
        return 0;
    }
}
/*
    解题思路：
        0.双指针
        1.用两根指针i和j分别从数组的首部和尾部向中间逼近，得到target在数组中的起始索引和结束索引，然后相减得到出现个数
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了28.19% 的用户
    内存消耗：41.4 MB, 在所有 Java 提交中击败了56.54% 的用户
 */