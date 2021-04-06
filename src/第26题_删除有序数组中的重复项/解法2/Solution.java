package 第26题_删除有序数组中的重复项.解法2;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int i = 0;
        while (i < len - 1) {
            if (nums[i] == nums[i + 1]) {
                for (int m = i + 1; m < len - 1; m++) {
                    nums[m] = nums[m + 1];
                }
                len--;
            } else {
                i++;
            }
        }
        return len;
    }
}
/*
    解题思路：
        0.暴力破解，双层for循环
        1.移动数组元素
 */
/*
    执行用时：119 ms, 在所有 Java 提交中击败了5.02% 的用户
    内存消耗：40 MB, 在所有 Java 提交中击败了95.56% 的用户
 */