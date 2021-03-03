package 第217题_存在重复元素.解法1;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
/**
 * 思路：暴力破解
 * 使用双层for循环判断是否有元素重复。可能会超出时间限制
 */
