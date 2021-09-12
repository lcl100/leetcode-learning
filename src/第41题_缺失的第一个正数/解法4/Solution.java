package 第41题_缺失的第一个正数.解法4;

/**
 * @author lcl100
 * @create 2021-09-11 22:24
 */
public class Solution {
    /**
     * <p>思路：原地哈希，数组中所有小于等于数组长度的数一定能在数组中找到它对应的位置，然后进行标记，再次遍历数组即可找到结果。参考官网题解：https://leetcode-cn.com/problems/first-missing-positive/solution/que-shi-de-di-yi-ge-zheng-shu-by-leetcode-solution/</p>
     * <p>步骤：</p>
     * <ul>
     *     <li>第一步，将数组中所有的负数和零修改为nums.length+1</li>
     *     <li>第二步，遍历数组对每个小于等于数组长度的数进行标记，即将遍历到的数x存储到x-1的下标位置处，并且打上负数标记，表示这个数存在于数组中</li>
     *     <li>第三步，遍历数组，找到的第一个正数即为缺失的数</li>
     * </ul>
     * <p>结果：成功</p>
     * <ul>
     *    <li>执行用时：2 ms, 在所有 Java 提交中击败了91.56% 的用户</li>
     *    <li>内存消耗：94.7 MB, 在所有 Java 提交中击败了35.06% 的用户</li>
     *    <li>通过测试用例：171 / 171</li>
     * </ul>
     *
     * @param nums 未排序的整数数组
     * @return 数组中没有出现的最小的正整数
     */
    public int firstMissingPositive(int[] nums) {
        // 第一步，将数组中所有的负数和零修改为nums.length+1
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] <= 0) {
                nums[i] = len + 1;
            }
        }

        // 第二步，遍历数组对每个小于等于数组长度的数进行标记，即打上负数标记，表示这个数存在于数组中
        for (int i = 0; i < len; i++) {
            // 因为有些数可能已经被标记了
            int num = Math.abs(nums[i]);
            // 对数进行标记
            if (num <= len) {
                nums[num - 1] = -Math.abs(nums[num - 1]);
            }
        }

        // 第三步，遍历数组，找到的第一个正数对应的下标加1就是结果
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return len + 1;
    }
}
