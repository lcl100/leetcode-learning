package 面试题_01_04_回文排列.解法1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean canPermutePalindrome(String s) {
        // 1.将s转换成字符数组，然后放到HashMap种统计出现次数
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char aChar : chars) {
            if (map.containsKey(aChar)) {
                Integer value = map.get(aChar);
                value++;
                map.put(aChar, value);
            } else {
                map.put(aChar, 1);
            }
        }
        // 2.判断每个字符的出现次数，如果不同的字符都出现了奇数次则返回false
        Set<Character> keySet = map.keySet();
        int count = 0;// 计数器，记录出现奇数次字符的个数
        for (Character key : keySet) {
            if (map.get(key) % 2 != 0) {
                count++;
            }
            // 如果出现奇数次字符的个数大于了1个，那么就不是回文串了
            if (count == 2) {
                return false;
            }
        }
        return true;
    }
}
/*
    解题思路：
        0.HashMap计数
        1.先使用HashMap统计每个字符的出现次数
        2.回文串种，出现奇数次的字符只能有一个，因此可以作为判断
        思路来源：https://leetcode-cn.com/problems/palindrome-permutation-lcci/solution/javachang-gui-jie-fa-xian-pai-xu-ran-hou-3wzg/
 */