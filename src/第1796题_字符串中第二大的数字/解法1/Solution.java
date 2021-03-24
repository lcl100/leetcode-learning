package 第1796题_字符串中第二大的数字.解法1;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int secondHighest(String s) {
        // 1.将字符串s中的数字放进Set集合
        Set<Integer> set = new HashSet<>();
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                set.add(Integer.parseInt(c + ""));
            }
            i++;
        }
        // 2.处理特殊情况
        if (set.size() == 1 || set.size() == 0) {
            return -1;
        }
        // 3.查找第二大值
        int max = -1;
        for (Integer val : set) {
            if (val > max) {
                max = val;
            }
        }
        int secondMax = -1;
        for (Integer val : set) {
            if (val > secondMax && val < max) {
                secondMax = val;
            }
        }
        return secondMax;
    }
}
/*
    解题思路：
        0.Set集合
        1.先用Set集合保存数字并去重
        2.查找Set集合中第二大值
 */
/*
    执行用时：9 ms, 在所有 Java 提交中击败了7.88% 的用户
    内存消耗：38.6 MB, 在所有 Java 提交中击败了24.91% 的用户
 */