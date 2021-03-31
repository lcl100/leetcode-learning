package 第557题III_反转字符串中的单词.解法1;

class Solution {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int m = 0;// 记录每个单词首字母的索引，用来提供reverse()方法的start参数
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ' || i == chars.length - 1) {
                reverse(chars, m, i == chars.length - 1 ? i + 1 : i);// 注意最后一个元素的索引
                m = i + 1;// 一个单词结束，开始下一个单词，更新索引m
            }
        }
        return new String(chars);
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
        0.循环遍历每个单词进行交换
        1.通过双指针确定每个单词，然后反转每个单词
 */
/*
    执行用时：5 ms, 在所有 Java 提交中击败了85.43% 的用户
    内存消耗：38.9 MB, 在所有 Java 提交中击败了81.03% 的用户
 */