package 第1317题_将整数转换为两个无零整数的和.解法2;

public class Solution {
    public int[] getNoZeroIntegers(int n) {
        int i = 1;
        while (!isContainZero(n - i)) {
            i++;
            while (!isContainZero(i)) {
                i++;
            }
        }
        return new int[]{i, n - i};
    }

    // 判断数num中是否包含0
    private boolean isContainZero(int num) {
        while (num != 0) {
            if (num % 10 == 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
/*
    解题思路：
        0.通过取模来判断一个数中是否包含0，而不是转换成字符串
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了72.32% 的用户
    内存消耗：36.2 MB, 在所有 Java 提交中击败了93.45% 的用户
 */
