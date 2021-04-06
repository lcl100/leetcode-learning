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
/*
    解题思路：
        0.双指针
        1.使用两个指针i和j，其中i是慢指针，j是快指针
        2.当nums[i]与给定的值相等时，递增j以跳过该元素
        3.只要nums[i]≠ val，我们就复制nums[j]到nums [i]并同时递增两个索引
        4.重复这一过程，直到j到达数组的末尾，该数组的新长度为i
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：37.1 MB, 在所有 Java 提交中击败了34.13% 的用户
 */