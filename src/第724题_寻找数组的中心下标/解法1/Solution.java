package 第724题_寻找数组的中心下标.解法1;

class Solution {
    public int pivotIndex(int[] nums) {
        // 求所有数的总和
        int totalSum = sum(nums, nums.length);
        // 循环遍历nums数组
        for (int i = 0; i < nums.length; i++) {
            // 计算前[0,i)之间所有元素的和，不包括nums[i]
            int preSum = sum(nums, i);
            // 计算(i,length-1]之间的所有元素的和，也不包括nums[i]
            int afterSum = totalSum - nums[i] - preSum;
            // 比较是否相等，如果相等，表示已经查找到中心下标
            if (preSum == afterSum) {
                return i;
            }
        }
        return -1;
    }

    // 求nums数组中[0,length)中所有元素的总和
    private int sum(int[] nums, int length) {
        if (length > nums.length) {
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
/*
    解题思路：
        0.暴力破解
 */
/*
    执行用时：200 ms, 在所有 Java 提交中击败了9.73% 的用户
    内存消耗：39 MB, 在所有 Java 提交中击败了76.02% 的用户
 */