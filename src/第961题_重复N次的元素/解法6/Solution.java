package 第961题_重复N次的元素.解法6;

public class Solution {
    public int repeatedNTimes(int[] A) {
        int i = 0;
        while (i < A.length) {
            if (index(A, A[i]) != lastIndex(A, A[i])) {
                return A[i];
            }
            i++;
        }
        return -1;
    }

    // 获取数字n在数组A中正序的索引
    private int index(int[] A, int n) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == n) {
                return i;
            }
        }
        return -1;
    }

    // 获取数字n在数组A中倒序的索引
    private int lastIndex(int[] A, int n) {
        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] == n) {
                return i;
            }
        }
        return -1;
    }
}
/*
    解题思路：
        0.模拟了字符串的indexOf()和lastIndexOf()方法
        1.如果从正序和倒序查找一个相同的数，如果它们的索引不相等，表示重复了，那么直接返回即可
    注：
        1.思路来源于以前的 387.字符串中的第一个唯一字符
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：39.3 MB, 在所有 Java 提交中击败了62.73% 的用户
 */