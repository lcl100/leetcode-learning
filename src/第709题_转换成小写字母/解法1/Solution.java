package 第709题_转换成小写字母.解法1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String toLowerCase(String str) {
        Map<Character, Character> map = new HashMap<>();
        map.put('A', 'a');
        map.put('B', 'b');
        map.put('C', 'c');
        map.put('D', 'd');
        map.put('E', 'e');
        map.put('F', 'f');
        map.put('G', 'g');
        map.put('H', 'h');
        map.put('I', 'i');
        map.put('J', 'j');
        map.put('K', 'k');
        map.put('L', 'l');
        map.put('M', 'm');
        map.put('N', 'n');
        map.put('O', 'o');
        map.put('P', 'p');
        map.put('Q', 'q');
        map.put('R', 'r');
        map.put('S', 's');
        map.put('T', 't');
        map.put('U', 'u');
        map.put('V', 'v');
        map.put('W', 'w');
        map.put('X', 'x');
        map.put('Y', 'y');
        map.put('Z', 'z');
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = map.get(chars[i]);
            }
        }
        return new String(chars);
    }
}
/*
    解题思路：
        0.字典表
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36.2 MB, 在所有 Java 提交中击败了61.45% 的用户
 */