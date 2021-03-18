package 面试题17_04_消失的数字.解法3;

class Solution {
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
        0.异或
            0^1^3^1^2^2^3=2，异或两个相同的数会抵消，因此会留下一个数，即为结果
 */