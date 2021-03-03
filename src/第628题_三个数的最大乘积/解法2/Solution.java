package 第628题_三个数的最大乘积.解法2;

import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        // 1.将数组排序
        Arrays.sort(nums);
        // 2.得出最大乘积
        int len=nums.length;
        if(nums[0]<0&&nums[1]<0&&nums[len-1]>0&&nums[0]*nums[1]*nums[len-1]>nums[len-1]*nums[len-2]*nums[len-3]){
            return nums[0]*nums[1]*nums[len-1];
        }
        return nums[len-1]*nums[len-2]*nums[len-3];
        // 下面这行是官方给出的return语句，更加简洁
        // return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
    }
}
/**
 * 思路：
 * 首先将数组排序，如果所有数都是正数，则最大三个数就是最后三个数。
 * 如果存在至少两个及以上的负数，并且第一、二个数乘以最后一个数大于最后三个数相乘，那么返回第一二个数乘以最后一个数就是最大乘积
 */