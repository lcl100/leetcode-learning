package 第1464题_数组中两元素的最大乘积.解法2;

import java.util.Arrays;

public class Solution {
    public int maxProduct(int[] nums) {
        // 1.对数组进行排序
        Arrays.sort(nums);
        // 2.返回最后两个元素的乘积
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }
}
/**
 * 思路：
 * 将数组从小到大排序，最后两个数的乘积即为所求
 */