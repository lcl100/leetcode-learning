package 第191题_位1的个数.解法4;

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            // 如果n & (n - 1) = 0，则说明此时的n值并无含1的位，因此我们也可以用n & (n - 1) == 0来判断一个数是否是2的幂次方
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：35.4 MB, 在所有 Java 提交中击败了43.27% 的用户
 */