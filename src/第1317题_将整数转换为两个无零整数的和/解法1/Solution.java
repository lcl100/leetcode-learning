package 第1317题_将整数转换为两个无零整数的和.解法1;

class Solution {
    public int[] getNoZeroIntegers(int n) {
        int i = 1;
        // 判断n-i这个数中是否包含0
        while (((n - i) + "").contains("0")) {
            i++;
            // 判断i这个数中是否包含0
            while ((i + "").contains("0")) {
                i++;
            }
        }
        // 最后返回两个数i和n-i即可
        return new int[]{i, n - i};
    }
}
/*
    解题思路：
        0.将i和n-i转换成字符串判断里面是否包含'0'字符
 */
/*
    执行用时：8 ms, 在所有 Java 提交中击败了6.85% 的用户
    内存消耗：36.5 MB, 在所有 Java 提交中击败了33.63% 的用户
 */