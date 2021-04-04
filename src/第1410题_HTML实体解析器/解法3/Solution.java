package 第1410题_HTML实体解析器.解法3;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public String entityParser(String text) {
        // 1.用HashMap存储字符实体与对应HTML字符的映射关系
        Map<String, String> map = new HashMap<>();
        map.put("&quot;", "\"");
        map.put("&apos;", "'");
        map.put("&amp;", "&");
        map.put("&gt;", ">");
        map.put("&lt;", "<");
        map.put("&frasl;", "/");
        // 2.用栈来临时存储特殊的字符实体，如"&quot;"
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();// 存储最后待返回结果的字符串
        int i = 0;// 指针，指向text字符串中的每个字符的索引下标
        while (i < text.length()) {
            char c = text.charAt(i);// 获取当前正在遍历的字符
            // 2.1 循环遍历text字符串，判断每个字符是否是'&'字符
            if (c != '&') {
                // 2.1.1 如果不是'&'字符，则保存到StringBuilder中
                // 如果当前字符不是特殊字符实体如"&quot;"的起始字符'&'，那么将该字符直接添加到结果字符串sb中
                sb.append(c);
                i++;// 并且i指针更新
            } else {
                // 2.1.2 如果是'&'字符，则考虑替换字符实体
                // 执行到这，表示当前遍历的字符是'&'，表示可能遇到特殊字符实体了，但需要进一步判断
                // 将'&'字符到';'字符之间的所有字符（包括'&'字符和';'字符）添加到栈中
                // 2.1.2.1 将'&'到';'字符之间的所有字符（包括'&'字符和';'字符）全部入栈
                while (text.charAt(i) != ';') {
                    stack.push(text.charAt(i));// 入栈
                    i++;// 更新i指针
                }
                stack.push(';');// 由于是以!=';'为判断条件，所以最后需要添加';'字符，并更新i指针
                i++;
                // 2.1.2.2 从栈中读取以'&'字符开头并且以';'字符结尾的所有字符，拼接成字符串，从Map中读取对应的映射关系，如果存在则返回对应的映射，如果不存在则返回拼接的字符串
                // 局部变量，用来保存从栈中读取的可能是特殊字符实体的所有字符，并连接成字符串
                StringBuilder ssb = new StringBuilder();
                while (!stack.empty()) {
                    ssb.insert(0, stack.pop());// 从栈中读取字符，由于栈的特性是先进后出，所以每次读取的字符要放在原字符串的最前面进行拼接
                }
                String entity = ssb.toString();// 将StringBuilder转换成String类型
                sb.append(map.getOrDefault(entity, entity));// 转换字符实体，注意，这里用的getOrDefault()方法，但两个参数相同，比较有意思，前者表示从Map中查询与之相等的键对应的值，后者在HashMap中没有的情况显示默认值
            }
        }
        // 3.返回结果
        return sb.toString();
    }
}
/*
    解题思路：
        0. 栈
        1. 用HashMap存储字符实体与对应HTML字符的映射关系
        2. 用栈来临时存储特殊的字符实体，如"&quot;"
            2.1 循环遍历text字符串，判断每个字符是否是'&'字符
                2.1.1 如果不是'&'字符，则保存到StringBuilder中
                2.1.2 如果是'&'字符，则考虑替换字符实体
                    2.1.2.1 将'&'到';'字符之间的所有字符（包括'&'字符和';'字符）全部入栈
                    2.1.2.2 从栈中读取以'&'字符开头并且以';'字符结尾的所有字符，拼接成字符串，从Map中读取对应的映射关系，如果存在则返回对应的映射，如果不存在则返回拼接的字符串
        3. 返回结果
    特别注意：
        1.最后一道测试还是无法通过，测试用例为："&amp;amp;amp;gt;"
 */
