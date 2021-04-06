package 第80题_删除有序数组中的重复项II.解法2;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int i = 2, j = 2;
        while (j < nums.length) {
            if (nums[i - 2] != nums[j]) {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        return i;
    }
}
/*
    解题思路：
        0.双指针
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了80.95% 的用户
    内存消耗：38.7 MB, 在所有 Java 提交中击败了39.73% 的用户
 */