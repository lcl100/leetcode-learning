package 第290题_单词规律.解法1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        // 字符对应单词的Map
        Map<Character, String> charToStringMap = new HashMap<>();
        // 单词对应字符的Map
        Map<String, Character> StringToCharMap = new HashMap<>();
        char[] patternChars = pattern.toCharArray();// 将pattern字符串转换成字符数组
        String[] split = s.split(" ");// 将s字符串按空格分割成字符串数组
        // 如果字符数组和单词字符串数组长度不相等，那么直接返回false即可
        if (patternChars.length != split.length) {
            return false;
        }
        // 一次循环即可，此时字符数组和单词字符串数组长度相等，并且i指针同时指向两个数组元素下标
        for (int i = 0; i < patternChars.length; i++) {
            // 只有字符对应单词或单词对应字符有一个满足，那就进行下一步
            if (charToStringMap.containsKey(patternChars[i]) || StringToCharMap.containsKey(split[i])) {
                if (!charToStringMap.getOrDefault(patternChars[i], "").equals(split[i]) && !StringToCharMap.getOrDefault(split[i], ' ').equals(patternChars[i])) {
                    return false;
                }
            } else {
                // 如果都不满足，表示两个Map中都不存在该字符和该单词
                charToStringMap.put(patternChars[i], split[i]);
                StringToCharMap.put(split[i], patternChars[i]);
            }
        }
        return true;
    }
}
/*
    题目解析：
        1.题目中这个所谓的规律有点难看出门道，仔细一看还是可以明白的
            例如：pattern = "abba", str = "dog cat cat dog"
                其中所谓的模式字符串pattern就是我们中文中的ABB、AABB等这种匹配，如胖乎乎、红红火火等
                而待判断的字符串str就是"胖乎乎"、"红红火火"这样的词，仔细看str中四个单词其中以空格分开，就是abba的模式，其中第一个字符串和第四个字符串相等，第二个字符串和第三个字符串相等，就是abba的模式
            例如：pattern = "abba", str = "dog cat cat fish"
                模式字符串pattern是"abba"，中文翻译一个可以是"火红红火"
                待判断的字符串str是"dog cat cat fish"，其中第一个字符串和第四个字符串不同，第二个字符串和第三个字符串相同，其实是"abbc"模式，不符合，所以返回false
    解题思路：
        1.双HashMap
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了99.57% 的用户
    内存消耗：36.3 MB, 在所有 Java 提交中击败了68.65% 的用户
 */