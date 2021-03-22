package 第387题_字符串中的第一个唯一字符.解法6;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public int firstUniqChar(String s) {
        // 使用Set去重，减轻用时
        char[] chars = s.toCharArray();
        Set<Character> set = new LinkedHashSet<>();
        for (char aChar : chars) {
            set.add(aChar);
        }
        Character[] characters = set.toArray(new Character[set.size()]);
        // 循环遍历每个字符，然后拿该字符去字符串中进行正则匹配
        for (char aChar : characters) {
            // 匹配的规则
            Pattern pattern = Pattern.compile(aChar + "");
            Matcher matcher = pattern.matcher(s);
            int count = 0;// 计数器，记录该字符被成功匹配的次数
            while (matcher.find()) {// 要通过find()方法来获取是否匹配成功
                count++;// 如果该字符匹配成功，则计数器加1
            }
            if (count == 1) {// 判断是否只匹配成功过一次，如果是，则是要查找的字符并返回
                return s.indexOf(aChar);
            }
        }
        return -1;
    }
}
/*
    解题思路：
        0.正则表达式
 */
/*
    执行用时：262 ms, 在所有 Java 提交中击败了5.20% 的用户
    内存消耗：38.9 MB, 在所有 Java 提交中击败了70.93% 的用户
 */
