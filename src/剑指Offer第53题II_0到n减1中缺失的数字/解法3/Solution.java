package 剑指Offer第53题II_0到n减1中缺失的数字.解法3;

public class Solution {
    public int missingNumber(int[] nums) {
        int result = nums.length;
        int i = 0;
        for (int num : nums) {
            result ^= i ^ num;
            i++;
        }
        return result;
    }
}
/*
    解题思路：
        0.位运算之异或
        1.例如0^1^3^1^2^2^3=2，异或两个相同的数会抵消，因此会留下一个数，即为结果
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：38.8 MB, 在所有 Java 提交中击败了76.02% 的用户
 */