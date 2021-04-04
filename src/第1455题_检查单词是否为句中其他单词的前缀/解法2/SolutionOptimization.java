package 第1455题_检查单词是否为句中其他单词的前缀.解法2;

/**
 * 解法2代码的优化处理
 */
public class SolutionOptimization {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int wordCount = 0;// 计数器，记录sentence字符串中单词的个数
        int i = 0;// 索引，sentence字符串中每个字符的索引
        int swLen = searchWord.length();
        int sLen = sentence.length();
        sentence = new StringBuilder(" ").append(sentence).toString();// 在sentence字符串最前面添加了一个空格，就可以省去判断第一个字符串的条件了
        while (i < sentence.length()) {
            char c = sentence.charAt(i);// 获取i索引对应的字符
            // 处理其他单词
            if ((c == ' ') && sentence.charAt(i + 1) != ' ') {
                wordCount++;// 单词个数加1
                if ((i + swLen) <= sLen && sentence.substring(i + 1, i + 1 + swLen).equals(searchWord)) {
                    return wordCount;
                }
            }
            i++;
        }
        return -1;
    }
}
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36.1 MB, 在所有 Java 提交中击败了89.10% 的用户
 */