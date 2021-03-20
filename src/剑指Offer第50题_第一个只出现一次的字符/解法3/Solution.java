package 剑指Offer第50题_第一个只出现一次的字符.解法3;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public char firstUniqChar(String s) {
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
        for (char aChar : chars) {
            if (map.get(aChar) == 1) {
                return aChar;
            }
        }
        return ' ';
    }
}
/*
    解题思路：
        0.HashMap计数
        1.解法3和解法2本质上是一样的，但需要注意的是解法2通过LinkedHashMap来保证输入的元素顺序，也只有保证了顺序才能找到第一个只出现一次的字符
        2.而解法3使用HashMap不需要保证元素的顺序，而在遍历的时候通过遍历数组元素来作为HashMap的键去查询对应的出现次数，也保证了顺序
 */