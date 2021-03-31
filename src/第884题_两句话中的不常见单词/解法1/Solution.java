package 第884题_两句话中的不常见单词.解法1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        // 连接A和B字符串
        String AB = A + " " + B;
        Map<String, Integer> map = getMapByString(AB);
        List<String> list = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                list.add(key);
            }
        }
        return list.toArray(new String[list.size()]);
    }

    // 根据空格分割字符串str，然后统计字符串中每个子字符串的出现次数
    private Map<String, Integer> getMapByString(String str) {
        String[] split = str.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String s : split) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        return map;
    }
}
/*
    解题思路：
        0.HashMap计数
        1.统计A和B两个字符串中每个单词的出现次数（注意：这里使用了split()方法来确定每个单词，比较耗时）
        2.最后取出Map中出现次数为1的单词就是我们需要的
   思路简述：
        1.找出A+B字符串中出现次数为1次的单词
 */
/*
    执行用时：8 ms, 在所有 Java 提交中击败了11.40% 的用户
    内存消耗：38.5 MB, 在所有 Java 提交中击败了43.18% 的用户
 */