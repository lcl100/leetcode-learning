package 第1979题_找出数组的最大公约数.解法1;

/**
 * @author lcl100
 * @create 2021-09-11 19:56
 */class Solution {
    /**
     * <p>思路：循环判断。</p>
     * <p>结果：成功</p>
     * <ul>
     *     <li>执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户</li>
     *     <li>内存消耗：37.9 MB, 在所有 Java 提交中击败了96.92% 的用户</li>
     *     <li>通过测试用例：215 / 215</li>
     * </ul>
     *
     * @param nums 整数数组
     * @return 最大数和最小数的最大公约数
     */
    public int findGCD(int[] nums) {
        // 第一步，求得数组中的最大数和最小数
        int max = nums[0];
        int min = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        // 第二步，判断最大公约数
        // 如果最大数对最小数取余，如果等于0那么最小数一定是最大公约数
        if (max % min == 0) {
            return min;
        } else {
            // 如果不等于，那么从最小数开始遍历，寻找最大公约数
            for (int i = min; i > 0; i--) {
                // 即最大数和最小数同时对i取余，为零者则是最大公约数
                if (max % i == 0 && min % i == 0) {
                    return i;
                }
            }
        }
        return 1;
    }
}
