package 第724题_寻找数组的中心下标.解法2;

public class Solution {
    public int pivotIndex(int[] nums) {
        // 计算nums数组中所有元素的总和
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        // 前缀和
        int preSum = 0;// 存储前i个元素（不包括i）的总和
        for (int i = 0; i < nums.length; i++) {
            if (2 * preSum + nums[i] == totalSum) {
                return i;
            }
            preSum += nums[i];
        }
        return -1;
    }
}
/*
    解题思路：
        0.前缀和
        1.先统计数组全部元素和为totalSum，当遍历到第i个元素时，前面i个元素（不包括i）的和为preSum
        2.则i后面（也不包括i）的元素之和为totalSum-preSum-nums[i]
        3.如果totalSum-preSum-nums[i]等于preSum就表示找到了数组的中心下标，其实思路和解法1是一样的
        4.totalSum-preSum-nums[i]=preSum  ->    2 * preSum + nums[i] == totalSum
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：39.2 MB, 在所有 Java 提交中击败了47.16% 的用户
 */
