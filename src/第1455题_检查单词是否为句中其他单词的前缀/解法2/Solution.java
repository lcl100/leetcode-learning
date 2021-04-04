package 第1455题_检查单词是否为句中其他单词的前缀.解法2;

public class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int wordCount = 0;// 计数器，记录sentence字符串中单词的个数
        int i = 0;// 索引，sentence字符串中每个字符的索引
        while (i < sentence.length()) {
            char c = sentence.charAt(i);// 获取i索引对应的字符
            // 单独处理第一个单词的情况，因为第一个单词前面没有空格，不方便确定
            if (i == 0) {
                wordCount++;// 单词个数加1
                // 比较两个字符串是否相等
                if ((i + searchWord.length()) < sentence.length() && sentence.substring(i, i + searchWord.length()).equals(searchWord)) {
                    return wordCount;
                }
            }
            // 处理其他单词
            if ((c == ' ') && sentence.charAt(i + 1) != ' ') {
                wordCount++;// 单词个数加1
                if ((i + searchWord.length()) < sentence.length() && sentence.substring(i + 1, i + 1 + searchWord.length()).equals(searchWord)) {
                    return wordCount;
                }
            }
            i++;
        }
        return -1;
    }
}
/*
    解题思路：
        1.循环遍历sentence字符串中每个字符
        2.确定单词的首字母，然后从首字母开始调用substring()方法截取searchWord.length长度的字符串，然后与searchWord比较是否相等，如果相等则返回单词索引
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36.3 MB, 在所有 Java 提交中击败了56.61% 的用户
 */
