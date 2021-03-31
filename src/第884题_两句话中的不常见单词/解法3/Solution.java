package 第884题_两句话中的不常见单词.解法3;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        StringBuilder sb = new StringBuilder();
        sb.append(" ").append(A).append(" ").append(B).append(" ");
        String AB = sb.toString();
        String[] ABSplit = AB.split(" ");
        List<String> list = new ArrayList<>();
        for (String s : ABSplit) {
            String splirt = " " + s + " ";
            if (AB.indexOf(splirt) == AB.lastIndexOf(splirt) && !s.equals("")) {
                list.add(s);
            }
        }
        return list.toArray(new String[list.size()]);
    }
}
/*
    解题思路：
        0.String的API
        1.将字符串A和字符串B连接在一起，用空格隔开，并在新字符串的首尾也添加一个空格
        2.然后用indexOf()和lastIndexOf()方法匹配每一个单词（注意：这里的单词应该是" this "，首尾带空格的，否则会匹配到字符）
        3.如果它们的结果索引不相等，表示该单词至少存在两个，那么不管，继续比较下一个单词，如果索引相等，表示只存在唯一一个，添加保存
        4.例如：A = "this apple is sweet", B = "this apple is sour"
               A + B = " this apple is sweet this apple is sour "
 */
/*
    执行用时：4 ms, 在所有 Java 提交中击败了28.32% 的用户
    内存消耗：38.2 MB, 在所有 Java 提交中击败了89.12% 的用户
 */