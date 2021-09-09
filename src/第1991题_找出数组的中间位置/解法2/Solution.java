package 第1991题_找出数组的中间位置.解法2;

/**
 * @author lcl100
 * @create 2021-09-09 22:37
 */
class Solution {
    /**
     * <p>思路：前缀和。如果某下标i的前缀和与其后缀和相等则表示找到了数组的中间位置。前缀和就是i之前所有元素的总和，后缀和就是i之后所有元素的总和，都不包括i。</p>
     * <p>结果：成功</p>
     * <ul>
     *     <li>执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户</li>
     *     <li>内存消耗：37.8 MB, 在所有 Java 提交中击败了49.67% 的用户</li>
     *     <li>通过测试用例：294 / 294</li>
     * </ul>
     *
     * @param nums 整数数组
     * @return 数组的中间位置
     */
    public int findMiddleIndex(int[] nums) {
        // 计算nums数组的中所有元素总和
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        int preSum = 0;// 前缀和
        for (int i = 0; i < nums.length; i++) {
            // 后缀和，即数组元素总和减去前缀和，减去当前元素得到的结果
            int postSum = sum - preSum - nums[i];
            // 如果前缀和等于后缀和则返回i
            if (preSum == postSum) {
                return i;
            }
            // 更新前缀和
            preSum += nums[i];
        }

        return -1;
    }
}