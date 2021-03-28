package 第709题_转换成小写字母.解法2;

public class Solution {
    public String toLowerCase(String str) {
        char[] cs = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = cs[chars[i] - 65];// 65是字符'A'的ASCII码值
            }
        }
        return new String(chars);
    }
}
/*
    解题思路：
        0.数组映射
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36.1 MB, 在所有 Java 提交中击败了76.59% 的用户
 */