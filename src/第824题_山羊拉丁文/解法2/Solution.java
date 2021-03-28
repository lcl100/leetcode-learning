package 第824题_山羊拉丁文.解法2;

public class Solution {
    public String toGoatLatin(String S) {
        // 将字符串转换成字符数组
        char[] chars = S.toCharArray();
        // 用来保存待返回的结果
        StringBuilder sb = new StringBuilder();
        char initials = ' ';// 保存每个单词首字母的变量，准确来说是辅音首字母
        boolean isVowel = false;// 判断当前正在遍历的字符是否是元音字母
        boolean isTail = false;// 判断当前正在遍历的字符是否是单词的尾字符（即单词的最后一个字符）
        boolean isInitial = false;// 判断当前正在遍历的字符是否是首字符（即单词的第一个字符）
        int wordCount = 0;// 记录当前是第几个单词，关系着在每个单词后添加几个'a'字符
        // 一次遍历
        for (int i = 0; i < chars.length; i++) {
            // 该语句可以判断当前字符是否是段落中每个单词的首字母
            // 即该字符的前一个字符为空字符并且该字符不为空，那么表示该字符是段落中单词的首字符
            if ((i == 0 || chars[i - 1] == ' ') && chars[i] != ' ') {
                // System.out.println("首字符："+chars[i]);
                isVowel = isVowel(chars[i]);// 判断单词的首字符是否是元音字母，如果是则isVowel为true，不是则为false
                isInitial = true;// 将首字符标志isInitial置为true，表明当前字符是首字符
                initials = chars[i];// 保存段落中每个单词的首字符
            } else {// 表示该字符不是单词的首字符
                isInitial = false;// 那么将isInitial标志置为false
            }
            // 该语句可以判断当前字符是否是一个单词的尾字符
            // 即当前字符不为空字符并且当前字符的下一个字符为空字符（注意，段落的最后一个单词没有下一个单词）
            if (chars[i] != ' ' && (i == chars.length - 1 || chars[i + 1] == ' ')) {
                // System.out.println("尾字符："+chars[i]);
                isTail = true;// 那么将isTail标志置为true，表示当前字符是单词的尾字符
                wordCount++;// wordCount记录了当前是第几个单词，用于在每个单词后面添加几个'a'字符
            } else {
                isTail = false;// 如果该字符不是尾字符，那么将该标志置为false
            }
            // 处理当前字符既是单词的首字符又是单词的尾字符的情况（即单词只有一个字符的情况），例如："I love you"中的"I"字符
            if (isTail && isInitial) {
                sb.append(chars[i]);
                sb.append("ma");
                for (int j = 0; j < wordCount; j++) {
                    sb.append("a");
                }
                continue;// 处理完成后，直接跳过当前循环
            }
            // 如果当前字符是首字符并且是辅音字母
            if (isInitial && !isVowel) {
                continue;// 那么直接跳过，暂时不添加该字符到StringBuilder，因为辅音字母要添加到该单词的尾部
            }
            // 添加该字符
            sb.append(chars[i]);
            // 判断当前字符是否是单词的尾字符，即已经遍历一个单词完毕
            if (isTail) {
                if (!isVowel) {// 如果当前单词的首字母是辅音字母，则添加该辅音字母到尾部
                    sb.append(initials);
                }
                sb.append("ma");
                for (int j = 0; j < wordCount; j++) {
                    sb.append("a");
                }
            }
        }
        return sb.toString();
    }

    // 判断字母是否是元音字母
    private boolean isVowel(char c) {
        return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U';
    }
}
/*
    解题思路：
        0.单层循环暴力破解
        1.直接将字符串s转换成字符数组，判断每个字符
    总结：
        1.上面代码待优化，看起来不友好
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36.9 MB, 在所有 Java 提交中击败了78.84% 的用户
 */