package 第1410题_HTML实体解析器.解法1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String entityParser(String text) {
        // 用HashMap存储字符实体与对应HTML字符的映射关系
        Map<String, String> map = new HashMap<>();
        map.put("&quot;", "\"");
        map.put("&apos;", "'");
        map.put("&amp;", "&");
        map.put("&gt;", ">");
        map.put("&lt;", "<");
        map.put("&frasl;", "/");
        // 双指针
        int i = 0, j = 0;
        StringBuilder sb = new StringBuilder();
        while (i < text.length() && j < text.length()) {
            // 查找text字符串中的'&'的索引，也是特殊字符实体的起始索引
            while (i < text.length() && text.charAt(i) != '&') {
                sb.append(text.charAt(i));// 如果不是'&'字符，那么直接添加到StringBuilder中
                i++;
            }
            // 查找text字符串中的';'的索引，确定特殊字符实体的结束索引
            while (j < text.length() && text.charAt(j) != ';') {
                j++;
            }
            // 已经确定了'&'和';'字符的索引位置，那么就可以直接得到特殊字符实体，例如："&quot;"、"&apos;"
            if (i < j && j < text.length() && text.charAt(i) == '&' && text.charAt(j) == ';') {
                // 调用substring()方法获取字符实体
                String entity = text.substring(i, j + 1);
                // 将字符实体替换为HashMap中指定的字符
                // 注意，这里用的是getOrDefault()方法，而不是get()方法，因为得到的字符实体entry可能不是HashMap中的特殊字符实体，如：&ambassador; 所以需要原路返回
                sb.append(map.getOrDefault(entity, entity));
                // 替换完成后，可以准备查找下一个特殊字符实体类了，所以更新i和j指针
                j++;
                i = j;
            }
        }
        return sb.toString();
    }
}
/*
    题目解析：
        1.本题要求将"&quot;"、"&apos;"....等字符串替换为指定的字符'\'、'''......
    解题思路：
        0.双指针
        1.用HashMap存储字符实体与对应HTML字符的映射关系，方便查询
        2.使用双指针i和j，其中i指向每个'&'字符的索引，而j指向每个';'，然后获取'&'字符到';'字符之间（包括边界）的所有字符，连成字符串，然后在HashMap中查询
        3.注意，'&'与';'之间的所有字符组成的字符串可能不是HashMap中的字符实体，所以需要注意判断
        4.如果不是'&'和';'字符，那么就将其他字符直接装进待返回的字符串中，不需要进行处理
    特别注意：
        1.该解法代码不能通过最后一道测试，但事实上在控制台或本地IDE能够正常通过，可能是系统Bug，评论区也有其他人遇到此问题，需注意
 */