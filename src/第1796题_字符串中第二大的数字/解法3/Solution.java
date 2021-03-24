package 第1796题_字符串中第二大的数字.解法3;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public int secondHighest(String s) {
        // 将字符串s中的数字添加到TreeMap中
        Map<Integer, Integer> map = new TreeMap<>();
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                int num = Integer.parseInt(c + "");
                map.putIfAbsent(num, num);
            }
            i++;
        }
        // 找出TreeMap中倒数第二个数就是所需要的
        int count = 0;
        for (Integer key : map.keySet()) {
            if (count == map.size() - 2) {
                return key;
            }
            count++;
        }
        return -1;
    }
}
/*
    解题思路：
        0.TreeMap的特性
 */
/*
    执行用时：11 ms, 在所有 Java 提交中击败了6.26% 的用户
    内存消耗：38.5 MB, 在所有 Java 提交中击败了33.60% 的用户
 */