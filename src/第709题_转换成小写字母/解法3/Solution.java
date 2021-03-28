package 第709题_转换成小写字母.解法3;

public class Solution {
    public String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] + 32);
            }
        }
        return new String(chars);
    }
}
/*
    解题思路：
        0.直接转换
        1.'A'字符的ASCII码值是65，'a'的ASCII码值是97，它们相差32
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36.2 MB, 在所有 Java 提交中击败了55.68% 的用户
 */