package 第824题_山羊拉丁文.解法3;

public class Solution {
    public String toGoatLatin(String S) {
        // 双指针，慢指针i指向段落中单词的首字母，而快指针j指向段落中的空格字符
        int i = 0, j = 0;
        // 将字符串S转换成字符数组
        char[] chars = S.toCharArray();
        // 用来保存待返回的字符串
        StringBuilder sb = new StringBuilder();
        // 计数器，记录段落中单词的数量
        int count = 0;
        while (j < chars.length) {
            // 将j指针快速跳到空格字符处
            while (j < chars.length && chars[j] != ' ') {
                j++;
            }
            // 同时表示记录了一个单词
            count++;
            // i指向的是单词的首字母，所以判断首字母是否是元音字母
            if (isVowel(chars[i])) {
                // 如果是元音字母，则添加整个单词
                sb.append(S.substring(i, j));
            } else {
                // 如果是辅音字母，则添加从单词的第二位到末尾的字母，然后将单词的首字母添加到后面
                sb.append(S.substring(i + 1, j)).append(chars[i]);
            }
            // 无论是元音字母还是辅音字母，都要进行的操作
            sb.append("ma");
            for (int m = 0; m < count; m++) {
                sb.append("a");
            }
            // 注意，最后一个单词的后面不需要添加空格
            if (j != chars.length) {
                sb.append(" ");
            }
            // 当处理完一个单词后，将i指向下一个单词的首字母索引
            i = j + 1;
            // 同时j也指向下一个单词的首字母
            j++;
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
        0.双指针
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36.5 MB, 在所有 Java 提交中击败了99.75% 的用户
 */