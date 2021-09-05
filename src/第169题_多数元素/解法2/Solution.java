package 第169题_多数元素.解法2;

class Solution {
    public int majorityElement(int[] nums) {
        int temp = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == temp) {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                temp = nums[i];
                count = 0;
            }
        }
        return temp;
    }
}
/*
    解题思路：
        0.摩尔投票法
 */