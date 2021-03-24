package 第1768题_交替合并字符串.解法1;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length(), len2 = word2.length();
        StringBuilder sb = new StringBuilder();
        // 1.交替添加相同长度字符串的字符
        int i = 0;
        int minLen = Math.min(len1, len2);
        while (i < minLen) {
            sb.append(word1.charAt(i)).append(word2.charAt(i));
            i++;
        }
        // 2.最后单独处理哪个字符串中剩余的字符
        if (i == len1) {
            sb.append(word2.substring(i, len2));
        } else {
            sb.append(word1.substring(i, len1));
        }
        return sb.toString();
    }
}
/*
    解题思路：
        0.循环遍历
        1.交替添加字符
        2.最后单独处理多余的字符
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36.9 MB, 在所有 Java 提交中击败了40.38% 的用户
 */