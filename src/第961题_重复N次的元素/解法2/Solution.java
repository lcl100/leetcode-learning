package 第961题_重复N次的元素.解法2;

import java.util.Arrays;

public class Solution {
    public int repeatedNTimes(int[] A) {
        // 1.排序
        Arrays.sort(A);
        int len = A.length;
        // 两根指针，i是慢指针，记录每个不重复元素的起始索引，j是快指针，记录每个不重复元素的结束索引（这里的结束索引其实是重复元素的最后一个元素的下一个元素的索引）
        // j-i的差值就是重复元素的出现次数
        int i = 0, j = 0;
        while (j < len) {
            if (A[i] == A[j]) {
                j++;
            } else {
                if ((j - i) == len / 2) {
                    return A[i];
                } else {
                    // 重置起始索引
                    i = j;
                }
            }
        }
        // 处理边界情况，如[1,2,3,3]这种情况，最后j到达数组长度的位置
        if (j == len && (j - i) == len / 2) {
            return A[i];
        }
        return -1;
    }
}
/*
    解题思路：
        0.计数
        1.先排序，排序后，重复元素才会聚集在一起
        2.通过两根指针来统计每个数的出现次数
 */
/*
    执行用时：9 ms, 在所有 Java 提交中击败了24.94% 的用户
    内存消耗：39.3 MB, 在所有 Java 提交中击败了71.85% 的用户
 */