package 剑指Offer第53题II_0到n减1中缺失的数字.解法4;

class Solution {
    public int missingNumber(int[] nums) {
        int A1 = 0;
        int d = 1;// 相邻两个数的差为1
        int i = 1;// 计数器，记录当前循环遍历的是第几个数
        for (int num : nums) {
            int An = A1 + (i - 1) * d;// 等差数列的公式，计算第n项的结果
            if (num != An) {
                return An;
            }
            i++;
        }
        return nums.length;
    }
}
/*
    解题思路：
        0.数学公式：等差数列
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：39.2 MB, 在所有 Java 提交中击败了8.51% 的用户
 */