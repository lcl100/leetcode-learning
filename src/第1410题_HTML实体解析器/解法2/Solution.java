package 第1410题_HTML实体解析器.解法2;

public class Solution {
    public String entityParser(String text) {
        return text
                .replaceAll("&quot;", "\"")
                .replaceAll("&apos;", "'")
                .replaceAll("&gt;", ">")
                .replaceAll("&lt;", "<")
                .replaceAll("&frasl;", "/")
                .replaceAll("&amp;", "&");
    }
}
/*
    解题思路：
        0.String的API
        1.直接利用replaceAll()方法替换所有特殊字符实体即可
 */
/*
    执行用时：50 ms, 在所有 Java 提交中击败了23.11% 的用户
    内存消耗：39.8 MB, 在所有 Java 提交中击败了9.43% 的用户
 */