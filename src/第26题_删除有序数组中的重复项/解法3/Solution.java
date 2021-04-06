package 第26题_删除有序数组中的重复项.解法3;

public class Solution {
    public int removeDuplicates(int[] nums) {
        //  1.用两根指针i和j一快一慢
        int i = 0, j = 0;
        while (j < nums.length) {
            // 2.使用while循环将j指针快进到第一个不等于i指针所指向元素的位置
            while (j < nums.length && nums[j] == nums[i]) {
                j++;
            }
            // 3.此时nums[j]不等于nums[i]，那么将i指针前进一步，并且将值置为nums[j]
            if (j < nums.length && nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        // 4.最后只需要返回i+1，就表示有效元素个数
        return i + 1;
    }
}
/*
    解题思路：
        0.双指针
        1.用两根指针i和j一快一慢，其中i是慢指针，指向每个重复元素的起始索引，而j是快指针，指向每个重复元素的结束索引（其实是下一个元素的开始索引）
        2.使用while循环将j指针快进到第一个不等于i指针所指向元素的位置
        3.此时nums[j]不等于nums[i]，那么将i指针前进一步，并且将值置为nums[j]
        4.最后只需要返回i+1，就表示有效元素个数
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了81.43% 的用户
    内存消耗：40.1 MB, 在所有 Java 提交中击败了84.07% 的用户
 */
