package 第557题III_反转字符串中的单词.解法4;

public class Solution {
    public String reverseWords(String s) {
        // 1.反转字符串中所有字符
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        // 2.将反转字符后的字符串按空格分割成字符串数组，然后反转所有字符串
        s = new String(chars);
        String[] split = s.split(" ");
        for (int i = 0; i < split.length / 2; i++) {
            String temp = split[i];
            split[i] = split[split.length - 1 - i];
            split[split.length - 1 - i] = temp;
        }
        // 3.将反转后的字符串数组转换成字符串返回
        StringBuilder sb = new StringBuilder();
        for (String str : split) {
            sb.append(str).append(" ");
        }
        return sb.toString().trim();
    }
}
/*
    解题思路：
        1.先反转整个字符串中所有字符
        2.然后按空格分割成字符串数组，再反转字符串数组中的所有字符串
 */
/*
    执行用时：9 ms, 在所有 Java 提交中击败了47.69% 的用户
    内存消耗：38.8 MB, 在所有 Java 提交中击败了92.78% 的用户
 */
