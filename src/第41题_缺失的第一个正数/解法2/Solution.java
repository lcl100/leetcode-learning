package 第41题_缺失的第一个正数.解法2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lcl100
 * @create 2021-09-11 21:38
 */
class Solution {
    /**
     * <p>思路：将数组中所有正整数保存到Map集合中，然后遍历1到max之间的所有数判断是否在Map集合中出现，如果没有出现则表示缺失。</p>
     * <p>步骤：</p>
     * <ul>
     *     <li>第一步，将数组中的正整数保存到Map集合中，并且求得数组中的最大值</li>
     *     <li>第二步，从1到最大数开始遍历，如果该数没有出现在Map集合中，表示缺失</li>
     * </ul>
     * <p>结果：成功（但不满足常数级别的额外空间）</p>
     * <ul>
     *     <li>执行用时:26 ms ,在所有Java提交中击败了7.30%的用户</li>
     *     <li>内存消耗:106.6 MB ，在所有Java提交中击败了 5.04%的用户</li>
     *     <li>通i过测试用例:171/ 171</li>
     * </ul>
     *
     * @param nums 未排序的整数数组
     * @return 数组中没有出现的最小的正整数
     */
    public int firstMissingPositive(int[] nums) {
        // 第一步，将数组中的正整数保存到Map集合中，并且求得数组中的最大值
        Map<Integer, Integer> map = new HashMap<>();
        int max = nums[0];
        for (int num : nums) {
            if (num > 0) {
                map.put(num, num);
            }
            max = Math.max(max, num);
        }
        // 如果最大值为负数表示全是负数则返回1，或者集合为空表示全是负数返回1
        if (max < 0 || map.size() == 0) {
            return 1;
        }
        // 第二步，从1到最大数开始遍历，如果该数没有出现在Map集合中，表示缺失
        for (int i = 1; i < max; i++) {
            if (!map.containsKey(i)) {
                return i;
            }
        }
        return max + 1;
    }
}