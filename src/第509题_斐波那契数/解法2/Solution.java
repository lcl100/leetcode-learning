package 第509题_斐波那契数.解法2;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int fib(int n) {
        return fibByMap(n, new HashMap<>());
    }

    private int fibByMap(int n, Map<Integer, Integer> map) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        } else {
            int val = fibByMap(n - 1, map) + fibByMap(n - 2, map);
            map.put(n, val);
            return val;
        }
    }
}
/*
    解题思路：
        0.备忘录算法
        1.解法1的继续优化
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：35.3 MB, 在所有 Java 提交中击败了16.86% 的用户
 */
