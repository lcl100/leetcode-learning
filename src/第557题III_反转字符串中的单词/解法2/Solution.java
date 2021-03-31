package 第557题III_反转字符串中的单词.解法2;

public class Solution {
    public String reverseWords(String s) {
        String[] split = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s1 : split) {
            char[] chars = s1.toCharArray();
            reverse(chars, 0, s1.length());
            sb.append(chars);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    // 交换chars数组中指定start索引和end索引之间的元素，范围是[start,end)
    private void reverse(char[] chars, int start, int end) {
        for (int i = 0; i < (end - start) / 2; i++) {
            char temp = chars[start + i];
            chars[start + i] = chars[end - 1 - i];
            chars[end - 1 - i] = temp;
        }
    }
}
/*
    解题思路：
        1.将字符串s按照空格分割成一个字符串数组，来确定每个单词
        2.依次遍历字符串数组然后交换
 */
/*
    执行用时：7 ms, 在所有 Java 提交中击败了64.43% 的用户
    内存消耗：39.4 MB, 在所有 Java 提交中击败了16.04% 的用户
 */
