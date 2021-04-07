package 剑指Offer第57题_和为s的两个数字.解法4;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 将nums数组中所有元素保存到HashSet中，访问的时候时间复杂度为O(1)
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        // 再次遍历nums数组，查找target-num是否存在于HashSet
        for (int num : nums) {
            int reduce = target - num;
            if (set.contains(reduce)) {
                return new int[]{num, reduce};
            }
        }
        return new int[]{};
    }
}
/*
    解题思路：
        0.哈希表
        1.将nums数组中所有元素添加到HashSet中
        2.再次遍历nums数组，查找target-num是否在HashSet中存在，这个查找时间复杂度O(1)，如果查找到则返回这对数字
 */
/*
    执行用时：59 ms, 在所有 Java 提交中击败了8.00% 的用户
    内存消耗：55.2 MB, 在所有 Java 提交中击败了85.87% 的用户
 */
