package 第709题_转换成小写字母.解法4;

public class Solution {
    public String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] |= 32;
        }
        return new String(chars);
    }
}
/*
    解题思路：
        0.位运算
        1.大写变小写或小写变大写：
            字符^=32;
            字符|=32;
        2.例如：
            'A'^32='a'       'a'^32='A'
            'A'|32='a'       'a'|32='A'
            'A'&-33='a'      'a'&-33='A'
        3.原理
            ASCII码表中的'A'字符的值为65，'a'字符的值为97，它们相差32
            'A'|32=65|32=01000001|00100000=0110 0001=97='a'
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36.4 MB, 在所有 Java 提交中击败了21.84% 的用户
 */