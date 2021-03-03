package 第27题_移除元素.解法3;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
/**
 * 思路：双指针
 * 使用两个指针i和j，其中i是满指针，j是快指针。
 * 当nums[i]与给定的值相等时，递增j以跳过该元素。
 * 只要nums[i]≠ val，我们就复制nums[j]到nums [i]并同时递增两个索引。
 * 重复这一过程，直到j到达数组的末尾，该数组的新长度为i。
 * 该解法与 删除排序数组中的重复项 的解法十分相似。
 */
