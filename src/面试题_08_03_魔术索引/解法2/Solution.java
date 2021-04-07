package 面试题_08_03_魔术索引.解法2;

public class Solution {
    public int findMagicIndex(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == i) {
                return i;
            } else if (nums[i] > i) {  //重点 , 过滤掉不需要比较的元素
                i = nums[i];
            } else {
                i++;
            }
        }
        return -1;
    }
}
/*
    解题思路：
    注：
        1.解题思路来源于：https://leetcode-cn.com/problems/magic-index-lcci/solution/javashuang-bai-jian-dan-xiao-lu-gao-by-variation-h/
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：39.1 MB, 在所有 Java 提交中击败了65.21% 的用户
 */