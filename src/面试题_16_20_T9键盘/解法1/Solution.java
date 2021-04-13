package 面试题_16_20_T9键盘.解法1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> getValidT9Words(String num, String[] words) {
        // 0.变量
        List<String> list = new ArrayList<>();
        // 1.获取数字和字母的映射字典表
        Map<Character, Integer> map = getMap();
        for (String word : words) {
            // 获取word字符串中的每个字符
            char[] chars = word.toCharArray();
            // 用来拼接自定义数字字符串的
            StringBuilder sb = new StringBuilder();
            // 循环遍历chars数组拼接数字字符串
            for (char c : chars) {
                sb.append(map.get(c));
            }
            // 比较数字字符串是否等于给定的num字符串，如果相等则添加
            if (sb.toString().equals(num)) {
                list.add(word);
            }
        }
        return list;
    }

    // 用HashMap来保存数字和字符的映射
    private Map<Character, Integer> getMap() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('!', 1);
        map.put('@', 1);
        map.put('#', 1);
        map.put('a', 2);
        map.put('b', 2);
        map.put('c', 2);
        map.put('d', 3);
        map.put('e', 3);
        map.put('f', 3);
        map.put('g', 4);
        map.put('h', 4);
        map.put('i', 4);
        map.put('j', 5);
        map.put('k', 5);
        map.put('l', 5);
        map.put('m', 6);
        map.put('n', 6);
        map.put('o', 6);
        map.put('p', 7);
        map.put('q', 7);
        map.put('r', 7);
        map.put('s', 7);
        map.put('t', 8);
        map.put('u', 8);
        map.put('v', 8);
        map.put('w', 9);
        map.put('x', 9);
        map.put('y', 9);
        map.put('z', 9);
        return map;
    }
}
/*
    解题思路：
        0.字典表
        1.用HashMap来保存数字和字符的映射
        2.循环遍历words字符串数组中的每个字符串word
            2.1循环遍历字符串word中的每个字符，然后用字典表查询该字符对应的数字，来组成一个数字字符串，然后与参数num比较
            2.2如果生成的数字字符串等于给定的参数数字字符串num，那么就添加到List集合中
        3.返回List集合

 */
/*
    执行用时：29 ms, 在所有 Java 提交中击败了16.83% 的用户
    内存消耗：41.3 MB, 在所有 Java 提交中击败了5.52% 的用户
 */