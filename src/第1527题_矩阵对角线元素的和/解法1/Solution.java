package 第1527题_矩阵对角线元素的和.解法1;

class Solution {
    public int diagonalSum(int[][] mat) {
        int len = mat.length;
        int sum = 0;
        for (int row = 0; row < len; row++) {
            for (int column = 0; column < len; column++) {
                // 判断每个元素的坐标是否满足i==j后者i+j=len-1，如满足则把该数计算到求和中
                if (row == column || row + column == len - 1) {
                    sum += mat[row][column];
                }
            }
        }
        return sum;
    }
}
/*
    解题思路：
        1.遍历矩阵中所有元素，判断每个元素的坐标是否满足i==j后者i+j=len-1，如满足则把该数计算到求和中
        2.例如，矩阵：
                [1, 2, 3],
                [4, 5, 6],
                [7, 8, 9]
               它们的坐标分别是：
                (0,0) (0,1) (0,2)
                (1,0) (1,1) (1,2)
                (2,0) (2,1) (2,2)
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了20.42% 的用户
    内存消耗：38.4 MB, 在所有 Java 提交中击败了79.19% 的用户
 */