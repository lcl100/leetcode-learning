package 第905题_按奇偶排序数组.解法1;


class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] newA = new int[A.length];
        int start = 0;
        int end = newA.length - 1;
        for (int a : A) {
            if (a % 2 == 0) {
                newA[start] = a;
                start++;
            } else {
                newA[end] = a;
                end--;
            }
        }
        return newA;
    }
}
/*    解题思路：
        0.新数组
        1.重新创建一个新数组，然后将偶数添加在前面，奇数添加在后面
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：39.4 MB, 在所有 Java 提交中击败了29.07% 的用户
 */