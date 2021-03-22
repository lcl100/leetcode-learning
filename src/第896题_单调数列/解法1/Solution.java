package 第896题_单调数列.解法1;

public class Solution {
    public boolean isMonotonic(int[] A) {
        int increCount = 0;// 大于的数量
        int decreCount = 0;// 小于的数量
        int equalCount = 0;// 等于的数量
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] < A[i + 1]) {
                increCount++;
            } else if (A[i] > A[i + 1]) {
                decreCount++;
            } else {
                equalCount++;
            }
        }
        return increCount + equalCount == A.length - 1 || decreCount + equalCount == A.length - 1;
    }
}
/*
    解题思路：
        0.一次循环，计数
        1.其中increCount用来记录A[i]<A[i+1]，decreCount用来记录A[i]>A[i+1]的情况，而equalCount用来记录A[i]==A[i+1]的情况
        2.最终如果是递增数列，那么increCount与equalCount的和必然等于数组长度减1
        3.最终如果是递减数列，那么decreCOunt与equalCount的和必然等于数组长度减1
 */
/*
    执行用时：2 ms, 在所有 Java 提交中击败了48.78% 的用户
    内存消耗：46.4 MB, 在所有 Java 提交中击败了88.19% 的用户
 */