package 第884题_两句话中的不常见单词.解法2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> map = new HashMap<>();
        getCount(map, A);
        getCount(map, B);
        List<String> list = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                list.add(key);
            }
        }
        return list.toArray(new String[list.size()]);
    }

    // 获取字符串str中的单词数量，没有使用空格分割，而是遍历字符
    private void getCount(Map<String, Integer> map, String str) {
        char[] chars = str.toCharArray();
        // 双指针，i指向单词的首字母，j指向单词尾字母的下一个空格字符，i和j是为了确认一个完整的单词
        int i = 0, j = 0;
        while (j < str.length()) {
            // 跳到空格字符的位置
            while (j < str.length() && chars[j] != ' ') {
                j++;
            }
            // 获取单词
            String word = str.substring(i, j);
            // 保存单词
            map.put(word, map.getOrDefault(word, 0) + 1);
            // 准备下一次循环
            i = j + 1;
            j++;
        }
    }
}
/*
    解题思路：
        0.解法1的优化
 */
/*
    执行用时：2 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：38.4 MB, 在所有 Java 提交中击败了73.58% 的用户
 */