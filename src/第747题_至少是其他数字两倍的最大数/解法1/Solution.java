package 第747题_至少是其他数字两倍的最大数.解法1;

class Solution {
    public int dominantIndex(int[] nums) {
        // 1.得到最大值
        int max = nums[0];
        int maxIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        // 2.判断最大值是否至少是其他数字的两倍
        int count = 0;// 计数器，用来记录数组中最大元素是其他数字两倍的个数
        for (int num : nums) {
            if (max >= 2 * num) {
                count++;
            }
        }
        // 如果count等于数组长度减去最大值的个数，表示最大元素是否至少是数组中每个其他数字的两倍，否则不是则返回-1
        return count == nums.length - 1 ? maxIndex : -1;
    }
}
/*
    解题思路：
        1.第一次遍历，得到nums数组中的最大值
        2.第二次遍历，依次判断最大值是否至少是其他数字（排除最大值本身）的两倍
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了50.61% 的用户
    内存消耗：36.4 MB, 在所有 Java 提交中击败了44.93% 的用户
 */