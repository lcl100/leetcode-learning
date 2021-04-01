package 第1624题_两个相同字符之间的最长子字符串.解法1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        // 1.用HashMap统计每个字符的出现次数、起始索引、结束索引
        Map<Character, Integer[]> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                // 如果Map中已经包含该元素了，说明该字符至少出现过1次了，那么只需要更新出现次数和结束索引
                Integer[] val = map.get(chars[i]);
                val[0]++;
                val[2] = i;
            } else {
                // 表示该字符第一次出现，那么需要初始化出现次数为1次和起始索引
                Integer[] val = new Integer[3];
                val[0] = 1;
                val[1] = i;
                val[2] = -1;
                map.put(chars[i], val);
            }
        }
        // 2.找出HashMap中出现次数大于等于的字符，并且计算val[2] - val[1] - 1，最后返回它们的最大值即max(val[2] - val[1] - 1)
        int max = -1;// 注意：可能存在这样的情况"cabbac"，有多个出现了两次的字符
        for (Character key : map.keySet()) {
            Integer[] val = map.get(key);
            if (val[0] >= 2) {// 注意：字符串中有些字符的出现次数可能大于2次，也要包括在内，如"mgntdygtxrvxjnwksqhxuxtrv"中的't'字符
                max = Math.max(val[2] - val[1] - 1, max);
            }
        }
        return max;
    }
}
/*
    题目解析：
        1.要求是返回两个相同字符之间的最长子字符串的长度
            关键字：两个相同字符、最长子字符串、长度
        2.例如：s = "abca"
            其中
                两个相同字符是'a'和'a'
                最长子字符串就是'a'和'a'之间的字符串（不包括边界），即"bc"
                最长字符串的长度就是"bc"的长度，那么该如何计算该长度呢，就是最后一次出现'a'字符的索引-第一次出现'a’字符的索引-1=3-0-1=2
        3.注意：
            字符串s中可能存在多个出现次数为2的字符，比如："acbbac"。因此需要记录所有出现次数为2的字符的结束索引和起始索引，然后求它们的子字符串的长度，最后返回最长的子字符串长度（即最大值）
            字符串s中可能存在出现次数大于2的字符，比如："mgntdygtxrvxjnwksqhxuxtrv"。因此判断条件出现次数需要大于等于2
    解题思路：
        0.HashMap计数
        1.用HashMap统计每个字符的出现次数，并且记录起始索引和结束索引
            其中HashMap的键为字符，值为一个Integer[3]数组，里面放置三个值，val[0]表示该字符的出现次数，val[1]表示该字符的起始索引，val[2]表示该字符的结束索引
        2.找到所有出现次数大于等于2的字符，并求max(lastIndex-firstIndex-1)就是结果
 */
/*
    执行用时：3 ms, 在所有 Java 提交中击败了24.50% 的用户
    内存消耗：36.7 MB, 在所有 Java 提交中击败了8.37% 的用户
 */
