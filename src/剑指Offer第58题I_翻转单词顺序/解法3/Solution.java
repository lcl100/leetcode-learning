package 剑指Offer第58题I_翻转单词顺序.解法3;

public class Solution {
    public String reverseWords(String s) {
        // 去除多余的空格
        s = s.trim().replaceAll("\\s+", " ");
        char[] chars = s.toCharArray();
        // 交换字符串中对称位置的所有字符
        reverse(chars, 0, chars.length);
        // 双指针，i记录每个单词的首字母索引，j记录空字符索引
        int i = 0, j = 0;
        while (j < chars.length) {
            // 确定空字符的索引位置
            while (j != chars.length && chars[j] != ' ') {
                j++;
            }
            // 交换每个单词中对称位置的字符
            reverse(chars, i, j);
            // 重置下一个单词的起始索引
            i = j + 1;
            j++;
        }
        // 重新将字符数组转换成字符串返回
        return new String(chars);
    }

    // 交换chars数组中指定start索引和end索引之间的元素
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
        0.交换数组中的字符
        1.交换思路如下： "the sky is blue"
            第一步：先交换整个字符串中对称位置的字符（处理多余空格后的字符串）
                "eulb si yks eht"
            第二步：接着交换每个单词中的字符
                "blue si yks eht"
                "blue is yks eht"
                "blue is sky eht"
                "blue is sky the"
 */
/*
    执行用时：7 ms, 在所有 Java 提交中击败了24.24% 的用户
    内存消耗：39 MB, 在所有 Java 提交中击败了10.19% 的用户
 */