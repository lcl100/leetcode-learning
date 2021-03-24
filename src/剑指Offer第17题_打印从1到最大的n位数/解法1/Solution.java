package 剑指Offer第17题_打印从1到最大的n位数.解法1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] printNumbers(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 9);
        map.put(2, 99);
        map.put(3, 999);
        map.put(4, 9999);
        map.put(5, 99999);
        map.put(6, 999999);
        map.put(7, 9999999);
        map.put(8, 99999999);
        map.put(9, 999999999);
        Integer limit = map.get(n);
        int[] numbers = new int[limit];
        for (Integer i = 0; i < limit; i++) {
            numbers[i] = i + 1;
        }
        return numbers;
    }
}
/*
    解题思路：
        0.字典表
        1.我们并不知道n的范围，但题目应该指出n的范围，毕竟它不可能太大，所以写一张字典表，直接查即可
        2.看题解有些不明所以，所以说这道题考查的是什么？
 */
/*
    执行用时：8 ms, 在所有 Java 提交中击败了15.59% 的用户
    内存消耗：47.1 MB, 在所有 Java 提交中击败了7.51% 的用户
 */