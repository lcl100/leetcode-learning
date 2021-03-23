package 第961题_重复N次的元素.解法3;

import java.util.Arrays;

public class Solution {
    public int repeatedNTimes(int[] A) {
        Arrays.sort(A);
        int len = A.length;
        if (A[len / 2] == A[len - 1]) {
            return A[len / 2];
        } else if (A[len / 2 - 1] == A[0]) {
            return A[0];
        } else {
            return A[len / 2];
        }
    }
}
/*
    解题思路：
        0.排序，因为排序后重复元素才会聚集在一起
        1.排序后，由于数组A中一定存在N/2个相同的元素，所以有如下三种情况：
            第一种情况   ——  [1,2,3,3]   ——  从A[A.length/2]到A[A.length-1]都是重复的N/2个元素，返回A[A.length/2]
            第二种情况   ——  [1,1,2,3]   ——  从A[0]到A[A.length/2-1]都是重复的N/2个元素，返回A[0]或A[A.length/2-1]
            第三种情况   ——  [1,2,2,3]   ——  那么A[A.length/2]一定是重复元素，返回A[A.length/2]
        2.当然还可以把第一种情况和第三种情况进行合并，效率也差不多
 */
/*
    执行用时：6 ms, 在所有 Java 提交中击败了40.36% 的用户
    内存消耗：39.4 MB, 在所有 Java 提交中击败了61.96% 的用户
 */