package 第747题_至少是其他数字两倍的最大数.解法2;

public class Solution {
    public int dominantIndex(int[] nums) {
        // 最大值和次大值
        int max = 0;
        int secondMax = 0;
        int maxIndex = -1;// 最大值的索引
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                // 如果当前nums[i]大于最大值，那么前最大值就应该是次大值，并且重新设置最大值max和保存最大值的索引
                secondMax = max;
                max = nums[i];
                maxIndex = i;
            } else if (nums[i] > secondMax) {
                // 判断是否大于次大值，如果是则保存为次大值
                secondMax = nums[i];
            }
        }
        // 判断最大值是否至少是次大值的二倍
        return max >= 2 * secondMax ? maxIndex : -1;
    }
}
/*
    解题思路：
        1.找出数组nums中的最大值和次大值
        2.如果最大值至少是次大值的二倍，那么最大值也一定至少是其他数字的二倍
        3.例如：nums = [1,2,3,4]，如果最大值4大于次大值3的二倍，那么一定也大于其他数字的二倍
    注：
        1.解题思路来源于：https://leetcode-cn.com/problems/largest-number-at-least-twice-of-others/solution/javayi-ci-bian-li-zhao-zui-da-he-ci-da-z-dw43/
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了50.61% 的用户
    内存消耗：36.3 MB, 在所有 Java 提交中击败了55.48% 的用户
 */