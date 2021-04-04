package 第1527题_矩阵对角线元素的和.解法2;

public class Solution {
    public int diagonalSum(int[][] mat) {
        int len = mat.length;
        int sum = 0;
        int middle = len / 2;
        for (int i = 0; i < len; i++) {
            sum += mat[i][i] + mat[i][len - i - 1];
        }
        // 如果len是奇数，那么mat[middle][middle]会被多加1次，所以需要减去
        // 如3*3矩阵、5*5矩阵等
        if (len % 2 == 1) {
            sum -= mat[middle][middle];
        }
        return sum;
    }
}
/*
    解题思路：
        1.逐行遍历，行号是i，只将每行的(i,i)和(i,n-i-1)位置的数添加到sum
        2.如果len是奇数，那么最中间位置的数被加两次，所以需要减去1次
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：38.6 MB, 在所有 Java 提交中击败了37.40% 的用户
 */