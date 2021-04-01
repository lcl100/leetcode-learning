package 第389题_找不同.解法3;

public class Solution {
    public char findTheDifference(String s, String t) {
        // 合并两个字符串
        String str = s.concat(t);
        // 对合并后字符串的每个字符进行异或操作
        char[] chars = str.toCharArray();
        // 对合并后字符串的所有字符进行异或操作，得到最后的结果
        char c = chars[0];
        for (int i = 1; i < chars.length; i++) {
            c ^= chars[i];
        }
        return c;
    }
}
/*
    解题思路：
        0.位运算的异或操作
        1.0^1^3^1^2^2^3=2，异或两个相同的数会抵消，因此会留下一个数，即为结果
            例如：'a'^'a'=0; 0^'a'='a'
            所以：'a'^'e'^'a'^'e'^'a'='a'^'a'^'a'^'e'^'e'='a'
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：37 MB, 在所有 Java 提交中击败了28.72% 的用户
 */