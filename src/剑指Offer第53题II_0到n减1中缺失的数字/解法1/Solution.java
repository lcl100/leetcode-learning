package 剑指Offer第53题II_0到n减1中缺失的数字.解法1;

class Solution {
    public int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            // 比较索引与nums[i]是否相等
            if (i != nums[i]) {
                return i;
            }
        }
        return nums.length;
    }
}
/*
    解题思路：
        1.判断nums数组中每个元素的值是否等于对应的下标索引
        2.如果都不等于，则返回数组长度
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：39 MB, 在所有 Java 提交中击败了34.29% 的用户
 */