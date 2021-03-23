package 第961题_重复N次的元素.解法5;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int repeatedNTimes(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : A) {
            if (map.containsKey(a)) {
                return a;
            } else {
                map.put(a, 1);
            }
        }
        return -1;
    }
}
/*
    解题思路：
        0.HashMap
        1.只要在HashMap中重复了一次就可以返回了
    注：
        1.解法1的优化
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了76.09% 的用户
    内存消耗：39.3 MB, 在所有 Java 提交中击败了67.22% 的用户
 */