package 第231题_2的幂.解法6;

public class Solution {
    public boolean isPowerOfTwo(int n) {
        // 如果是0和负数则返回false
        if (n <= 0) {
            return false;
        }
        // 利用位运算进行比较，这个位运算式子在HashMap源码中有用到
        return (n & (n - 1)) == 0;
    }
}
/*
    解题思路：
        0.代码思路来源于官方题解：https://leetcode-cn.com/problems/power-of-two/solution/2de-mi-by-leetcode/
            若n=8=(00001000)2​
          则n-1=7=(00000111)2
        则n&(n-1)=(00000000)2
              且0=(00000000)2
 */