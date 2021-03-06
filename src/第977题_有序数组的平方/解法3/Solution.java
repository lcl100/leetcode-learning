package 第977题_有序数组的平方.解法3;

class Solution {
    public int[] sortedSquares(int[] A) {
        int[] res = new int[A.length];// 辅助数组，用来存放有序数组的平方，即用来存放结果的
        // 三根指针，其中i指向A数组从前往后的元素的索引，j指向A数组从后往前的元素的索引，pos指向res数组从后往前装元素的索引位置
        int i = 0, j = A.length - 1, pos = A.length - 1;
        while (i < j) {
            int ii = A[i] * A[i];// A[i]的平方数
            int jj = A[j] * A[j];// A[j]的平方数
            if (ii > jj) {
                // 如果A[i]的平方数大于A[j]的平方数
                // 那么保存大数即可，并且pos和i指针更新
                res[pos] = ii;
                pos--;
                i++;
            } else if (ii == jj) {
                // 如果A[i]的平方数等于A[j]的平方数
                // 那么保存两个数，并且pos指针更新两次，i和j指针更新
                res[pos] = ii;
                pos--;
                i++;
                res[pos] = jj;
                pos--;
                j--;
            } else if (ii < jj) {
                // 如果A[i]的平方数大于A[j]的平方数
                // 那么保存大数A[j]，并且pos和j指针更新
                res[pos] = jj;
                pos--;
                j--;
            }
        }
        // 处理数组元素是奇数个，最终i==j的特殊情况，此时pos为0
        if (i == j) {
            res[pos] = A[i] * A[i];
        }
        return res;
    }
}
/*
    解题思路：
        0.双指针
        1.由于题目中数组是按升序排列的，所以如果是它们的平方数，也是两头大，中间小，即从两头向中间逐渐减小，所以只需要比较数组两端相同索引的数即可
        2.注意，由于数组的元素个数可能是奇数个，那么最后i和j都会到达数组最中间元素的位置，此时i==j，所以最后需要特殊处理下
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：40.5 MB, 在所有 Java 提交中击败了12.08% 的用户
 */