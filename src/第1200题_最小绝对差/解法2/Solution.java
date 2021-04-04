package 第1200题_最小绝对差.解法2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        // 1.找出最小绝对差
        int minAbsDiff = Math.abs(arr[0] - arr[1]);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    minAbsDiff = Math.min(minAbsDiff, Math.abs(arr[j] - arr[i]));
                }
            }
        }
        // 2.找出具有最小绝对差的元素对，保存到List
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + minAbsDiff == arr[j] && arr[i] != arr[j]) {
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    lists.add(list);
                }
            }
        }
        // 3.排序，按题目要求按升序的顺序返回
        Collections.sort(lists, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(0) - o2.get(0);
            }
        });
        return lists;
    }
}
/*
    解题思路：
        0.暴力破解
        1.找出最小绝对差
        2.找出具有最小绝对差的元素对，保存到List
        3.排序，按题目要求按升序的顺序返回
 */
/*
    超出时间限制（34 / 36 个通过测试用例）
 */