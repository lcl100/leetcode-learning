package 第169题_多数元素.解法3;

import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int major=nums[(int)nums.length/2];
        return major;
    }
}
