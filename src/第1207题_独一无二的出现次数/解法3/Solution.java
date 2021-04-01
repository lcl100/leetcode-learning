package 第1207题_独一无二的出现次数.解法3;

import java.util.Arrays;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // 用来保存每个数的出现次数，数组中数的最大出现次数就是arr.length（即数组中所有数都重复），所以可以用数组来保存出现次数
        int[] count = new int[arr.length + 1];
        // 将arr数组排序
        Arrays.sort(arr);
        // 使用双指针计算出现次数
        int i = 0, j = 0;
        while (j < arr.length) {
            while (j < arr.length && arr[j] == arr[i]) {
                j++;
            }
            // 在这里判断是否已经出现了重复的出现次数，如果是则返回false
            if (count[j - i] >= 1) {
                return false;
            }
            count[j - i]++;// 将出现次数加1
            if (j != arr.length) {
                i = j;
            }
        }
        return true;
    }
}
/*
    解题思路：
        0.解法2的优化
        1.使用数组来保存每个数的出现次数，这是可行的，数组长度为arr.length+1
        2.直接记录每个数的出现次数的出现次数，当然也可以更加数组下标获取每个数的出现次数
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36.2 MB, 在所有 Java 提交中击败了84.72% 的用户
 */