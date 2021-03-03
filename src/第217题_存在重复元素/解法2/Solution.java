package 第217题_存在重复元素.解法2;

import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==nums[i+1]){// 判断相邻元素是否重复
                return true;
            }
        }
        return false;
    }
}
/**
 * 思路：
 * 先将数组排序，然后判断相邻元素是否重复
 */