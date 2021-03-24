package 第326题_3的幂.解法1;

class Solution {
    public boolean isPowerOfThree(int n) {
        // 处理0和负数
        if (n <= 0) {
            return false;
        }
        int power = 1;
        while (power < n) {
            power *= 3;
        }
        return power == n;
    }
}
/*
    解题思路：
        0.暴力破解
        1.从1开始不断乘以3，直到等于n
 */
/*
    超出时间限制
 */