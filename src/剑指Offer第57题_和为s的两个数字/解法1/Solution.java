package 剑指Offer第57题_和为s的两个数字.解法1;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{nums[i], nums[j]};
                }
            }
        }
        return new int[]{};
    }
}
/*
    解题思路：
        0.暴力破解，双层for循环
        1.使用双层for循环判断是否有两个数的和等于target
 */
/*
    超出时间限制（28 / 36 个通过测试用例）
 */