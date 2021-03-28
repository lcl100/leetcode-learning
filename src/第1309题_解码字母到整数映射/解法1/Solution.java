package 第1309题_解码字母到整数映射.解法1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String freqAlphabets(String s) {
        // 使用HashMap存储映射关系
        Map<String, String> map = new HashMap<>();
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");
        map.put("4", "d");
        map.put("5", "e");
        map.put("6", "f");
        map.put("7", "g");
        map.put("8", "h");
        map.put("9", "i");
        map.put("10#", "j");
        map.put("11#", "k");
        map.put("12#", "l");
        map.put("13#", "m");
        map.put("14#", "n");
        map.put("15#", "o");
        map.put("16#", "p");
        map.put("17#", "q");
        map.put("18#", "r");
        map.put("19#", "s");
        map.put("20#", "t");
        map.put("21#", "u");
        map.put("22#", "v");
        map.put("23#", "w");
        map.put("24#", "x");
        map.put("25#", "y");
        map.put("26#", "z");
        // 循环遍历字符串
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < s.length()) {
            // 处理"12#"这种带井号的情况
            if (i + 2 < s.length()) {
                if (s.charAt(i + 2) == '#') {
                    String str = s.charAt(i) + "" + s.charAt(i + 1) + "" + s.charAt(i + 2);
                    sb.append(map.get(str));
                    i += 3;
                    continue;
                }
            }
            // 处理只有一个数字字符的情况
            sb.append(map.get(s.charAt(i) + ""));
            i++;
        }
        return sb.toString();
    }
}
/*
    解题思路：
        0.HashMap存储映射关系
        1.使用HashMap存储数字和字母的映射关系，然后遍历字符串字符，然后在HashMap中查找指定的字符
 */
/*
    执行用时：9 ms, 在所有 Java 提交中击败了7.11% 的用户
    内存消耗：37.4 MB, 在所有 Java 提交中击败了15.85% 的用户
 */