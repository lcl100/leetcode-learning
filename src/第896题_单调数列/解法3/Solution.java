package 第896题_单调数列.解法3;

public class Solution {
    public boolean isMonotonic(int[] A) {
        boolean incre = true;// 变量，用来记录是否是递增数列
        boolean decre = true;// 变量，用来记录是否是递减数列
        for (int i = 0; i < A.length - 1; i++) {
            // 只要有一对不是递增，那么可能就是递减或者都不是
            if (A[i] > A[i + 1]) {
                incre = false;
            }
            // 只要有一对不是递减，那么可能就是递增或者都不是
            if (A[i] < A[i + 1]) {
                decre = false;
            }
        }
        // 最后只要递增和递减有一个为true就满足要求，表示是一个递增（减）数列
        return incre || decre;
    }
}
/*
    解题思路：
        0.记录递增/递减
 */
/*
    执行用时：3 ms, 在所有 Java 提交中击败了48.78% 的用户
    内存消耗：46.6 MB, 在所有 Java 提交中击败了78.62% 的用户
 */