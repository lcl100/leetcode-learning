package 第434题_字符串中的单词数.解法2;

public class Solution {
    public int countSegments(String s) {
        int segmentCount = 0;// 计数器，记录单词的个数
        // 循环遍历段落中的每个字符
        for (int i = 0; i < s.length(); i++) {
            // 注意，i==0表示段落中记录第一个单词
            if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
                segmentCount++;
            }
        }
        return segmentCount;
    }
}
/*
    解题思路：
        0.单层for循环计数
        1.在段落中检查单词的个数，即判断某单词的前一个字符为空，但空字符的下一个字符不为空，那么表示记录为一个单词
        2.例如："Hello, my name is John"，注意，第一个单词的索引为0，例如"my"单词，"my"的前一个字符是空格，而"my"中的"m"不是空格，所以记录为一个单词
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36.3 MB, 在所有 Java 提交中击败了44.77% 的用户
 */