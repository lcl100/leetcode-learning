package 第41题_缺失的第一个正数.解法5;

/**
 * @author lcl100
 * @create 2021-09-11 22:51
 */
public class Solution {
    /**
     * <p>思路：数组置换元素。参考官网题解：https://leetcode-cn.com/problems/first-missing-positive/solution/que-shi-de-di-yi-ge-zheng-shu-by-leetcode-solution/</p>
     * <p>步骤：</p>
     * <ul>
     *     <li>第一步，交换数组中的nums[nums[i]-1]与nums[i]</li>
     *     <li>第二步，遍历数组，找到nums[i]不等于i+1的值，返回i+1</li>
     * </ul>
     * <p>结果：成功</p>
     * <ul>
     *     <li>执行用时：2 ms, 在所有 Java 提交中击败了91.56% 的用户</li>
     *     <li>内存消耗：94.7 MB, 在所有 Java 提交中击败了36.24% 的用户</li>
     *     <li>通过测试用例：171 / 171</li>
     * </ul>
     *
     * @param nums 未排序的整数数组
     * @return 数组中没有出现的最小的正整数
     */
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;

        // 第一步，交换数组中的nums[nums[i]-1]与nums[i]
        for (int i = 0; i < len; i++) {
            while (nums[i] > 0 && nums[i] <= len && nums[nums[i] - 1] != nums[i]) {
                // 交换nums[nums[i]-1]与nums[i]
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        // 第二步，遍历数组，找到nums[i]不等于i+1的值，返回i+1
        for (int i = 0; i < len; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return len + 1;
    }
}
