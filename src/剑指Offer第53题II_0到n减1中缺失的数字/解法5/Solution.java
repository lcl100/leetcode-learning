package 剑指Offer第53题II_0到n减1中缺失的数字.解法5;

public class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            sum += i - nums[i];
        }
        return sum + len;// 最后需要加上nums.length
    }
}
/*
    解题思路：
        0.数学
        1.先求[0,nums.length]的和，然后再依次减去nums数组中每个元素，最后得到的值就是结果
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：39.1 MB, 在所有 Java 提交中击败了28.11% 的用户
 */