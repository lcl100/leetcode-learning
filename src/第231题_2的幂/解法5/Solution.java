package 第231题_2的幂.解法5;

class Solution {
    public boolean isPowerOfTwo(int n) {
        // 如果是0和负数则返回false
        if (n <= 0) {
            return false;
        }
        // 利用位运算进行比较
        return (n & (-n)) == n;
    }
}
/*
    解题思路：
        0.代码思路来源于官方题解：https://leetcode-cn.com/problems/power-of-two/solution/2de-mi-by-leetcode/
            若n=8=(00001000)2​
          则-n=-8=(11111000)2
         若n&(-n)=(00001000)2
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：35.6 MB, 在所有 Java 提交中击败了34.67% 的用户
 */