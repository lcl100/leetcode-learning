package 面试题17_04_消失的数字.解法6;

class Solution {
    public int missingNumber(int[] nums) {
        int realSum = 0;
        for (int i = 0; i <= nums.length; i++) {
            realSum += i;
        }
        for (int num : nums) {
            realSum -= num;
        }
        return realSum;
    }
}
/*
    解题思路：
       1.将[0,n]的总和减去nums数组中所有元素的总和，差值即为所求
 */
