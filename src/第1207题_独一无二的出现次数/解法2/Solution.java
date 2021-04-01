package 第1207题_独一无二的出现次数.解法2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // 将arr数组排序
        Arrays.sort(arr);
        // 用来保存每个数的出现次数
        List<Integer> list = new ArrayList<>();
        // 使用双指针计算出现次数
        int i = 0, j = 0;
        while (j < arr.length) {
            while (j < arr.length && arr[j] == arr[i]) {
                j++;
            }
            list.add(j - i);
            if (j != arr.length) {
                i = j;
            }
        }
        // 寻找List中的重复元素
        Integer[] result = list.toArray(new Integer[list.size()]);
        Arrays.sort(result);
        for (int m = 0; m < result.length - 1; m++) {
            if (result[m] == result[m + 1]) {
                return false;
            }
        }
        return true;
    }
}
/*
    解题思路：
        0.双指针计数
        1.将数组arr中所有数进行排序，排序后，重复数会相邻，然后用快慢指针计算每个数的出现次数，保存在集合List中
        2.将List集合转换成数组排序，然后比较是否相邻元素相等，如果有表示重复，那么出现次数重复则返回false
 */
/*
    执行用时：2 ms, 在所有 Java 提交中击败了92.47% 的用户
    内存消耗：36.2 MB, 在所有 Java 提交中击败了84.72% 的用户
 */

