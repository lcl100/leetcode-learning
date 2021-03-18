package 面试题17_04_消失的数字.解法4;

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
        }
        return nums.length;
    }
}
/*
    解题思路：
        0.数学公式：等差数列
 */
