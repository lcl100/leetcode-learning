package 第1822题_数组元素积的符号.解法2;

class Solution {
    public int arraySign(int[] nums) {
        int negativeNumberCount = 0;// 统计负数的个数
        int zeroNumberCount = 0;// 统计零的个数
        for (int num : nums) {// 循环遍历nums数组中的每个数
            if (num == 0) {
                // 统计0的个数
                zeroNumberCount++;
            } else if (num < 0) {
                // 统计负数的个数
                negativeNumberCount++;
            }
        }
        // 如果存在0，则直接返回0
        if (zeroNumberCount > 0) {
            return 0;
        }
        // 根据负数的个数返回1还是-1
        return negativeNumberCount % 2 == 0 ? 1 : -1;
    }
}
/*
    解题思路：
        1.计算nums数组中负数的个数和0的个数
        2.如果nums数组中存在0，则返回0；如果不存在0，那么负数的个数是偶数个则返回1（因为偶数个负数相乘则一定是正数），是奇数个则返回-1（因为奇数个负数相乘则一定是负数）
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：38.3 MB, 在所有 Java 提交中击败了32.17% 的用户
 */