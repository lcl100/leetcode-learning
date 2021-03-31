package 第1800题_最大升序子数组和.解法2;

public class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = 0;// 记录最大的sum
        int sum = 0;// 记录升序子数组所有数的总和
        int i = 0, j = 1;// 双指针，j从1开始，为了能够比较前一个数的大小
        while (j <= nums.length) {// "<="是为了处理当j==nums.length的情况，即最后一个数
            sum += nums[i];
            if (j == nums.length || nums[j] <= nums[i]) {
                // 获取最大值
                if (sum > maxSum) {
                    maxSum = sum;
                }
                // 重置sum
                sum = 0;
            }
            i++;
            j++;
        }
        return maxSum;
    }
}
/*
    解题思路：
        0.双指针
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36.1 MB, 在所有 Java 提交中击败了49.32% 的用户
 */