package 第1991题_找出数组的中间位置.解法3;

/**
 * @author lcl100
 * @create 2021-09-09 22:45
 */
class Solution {
    /**
     * <p>思路：前缀和的变种。</p>
     * <p>结果：成功</p>
     * <ul>
     *     <li>执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户</li>
     *     <li>内存消耗：37.5 MB, 在所有 Java 提交中击败了98.25% 的用户</li>
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
            // 前缀和 + nums[i] + 后缀和 = 总和
            // if(前缀和==后缀和) return i;
            // 所以：if(2*前缀和=总和-nums[i]) return i;
            // 如果前缀和的2倍等于总和减去当前值则表示找到数组的中间位置
            if (preSum * 2 == sum - nums[i]) {
                return i;
            }
            // 更新前缀和
            preSum += nums[i];
        }

        return -1;
    }
}