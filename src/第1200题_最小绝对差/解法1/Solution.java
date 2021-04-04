package 第1200题_最小绝对差.解法1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        // 1.对数组排序
        Arrays.sort(arr);
        // 2.找出最小绝对差
        int minAbsDiff = Math.abs(arr[1] - arr[0]);
        for (int i = 1; i < arr.length; i++) {
            minAbsDiff = Math.min(minAbsDiff, Math.abs(arr[i] - arr[i - 1]));
        }
        // 3.循环数组，判断相差元素对的差值是否等于最小绝对差，如果相等则保存到List中
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + minAbsDiff == arr[i + 1]) {
                List<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[i + 1]);
                lists.add(list);
            }
        }
        return lists;
    }
}
/*
    解题思路：
        1.将数组排序，遍历数组找出最小绝对差
        2.再次遍历数组，判断相邻元素对的差值是否等于最小绝对差，如果相等则保存到List中，否则不保存
 */
/*
    执行用时：20 ms, 在所有 Java 提交中击败了35.19% 的用户
    内存消耗：49.4 MB, 在所有 Java 提交中击败了49.19% 的用户
 */