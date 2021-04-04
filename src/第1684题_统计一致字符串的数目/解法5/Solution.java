package 第1684题_统计一致字符串的数目.解法5;

public class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int wordCount = 0;// 计数器，记录一致字符串的个数
        for (String word : words) {
            int count = 0;// 计数器，记录word字符串中字符在allowed字符串中出现过的次数
            for (char c : word.toCharArray()) {
                // 判断c字符是否在allowed字符串中出现过
                if (allowed.contains(String.valueOf(c))) {
                    count++;
                }
            }
            if (count == word.length()) {// 必须要word中所有字符都在allowed中出现过才能判定为一致字符串
                wordCount++;
            }
        }
        return wordCount;
    }
}
/*
    解题思路：
        0.暴力破解
 */
/*
    执行用时：30 ms, 在所有 Java 提交中击败了21.62% 的用户
    内存消耗：39.8 MB, 在所有 Java 提交中击败了23.38% 的用户
 */