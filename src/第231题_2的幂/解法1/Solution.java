package 第231题_2的幂.解法1;

class Solution {
    public boolean isPowerOfTwo(int n) {
        int power = 1;
        while (power < n) {
            power *= 2;// 不断乘以2
        }
        // 最终判断是否相等
        return power == n;
    }
}
/*
    解题思路：
        0.暴力破解
        1.从1开始不断乘以2，然后判断是否等于n
 */
/*
    超出时间限制
 */
