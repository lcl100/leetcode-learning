package 第520题_检测大写字母.解法1;

class Solution {
    public boolean detectCapitalUse(String word) {
        // 统计字符串word中的大写字母的个数
        int capitalCount = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                capitalCount++;
            }
        }
        // 判断是否正确使用大写
        /*
            1.capitalCount == word.length() ——  表示所有字母都是大写的
            2.(capitalCount == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') ——  表示单词的首字母是大写的
            3.capitalCount == 0 ——  表示全是小写字母
         */
        return capitalCount == word.length() || (capitalCount == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') || capitalCount == 0;
    }
}
/*
    解题思路：
        0.计数
        1.统计字符串中大写字母的个数
        2.判断大写字母的个数是否满足单词的正确大写用法
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36.6 MB, 在所有 Java 提交中击败了90.53% 的用户
 */