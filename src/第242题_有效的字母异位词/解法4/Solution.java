package 第242题_有效的字母异位词.解法4;

public class Solution {
    public boolean isAnagram(String s, String t) {
        // 长度不相等则一定不等
        if (s.length() != t.length()) {
            return false;
        }
        // 用一个数组来统计每个字符的出现次数
        int[] lettersCount = new int[26];
        // 统计字符串s中每个字符的出现次数
        for (char c : s.toCharArray()) {
            lettersCount[c - 'a']++;// 加1操作
        }
        // 减去字符串t中每个字符的出现次数
        for (char c : t.toCharArray()) {
            lettersCount[c - 'a']--;// 减1操作
        }
        // 判断lettersCount数组中所有数是否等于0
        for (int count : lettersCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
/*
    解题思路：
        0.单数组计数
        1.同解法3不同的是，本解法只用了一个数组，也是用来统计字符串中每个字符的出现次数
        2.一个统计每个字符的出现次数，另一个是如果该字符在另一个字符串中出现了则减1
        3.如果两个字符串完全相等，那么最终数组中所有字符的出现次数都为0，如果有字符出现次数不为0，那么直接返回false
 */
/*
    执行用时：2 ms, 在所有 Java 提交中击败了99.98% 的用户
    内存消耗：38.8 MB, 在所有 Java 提交中击败了44.01% 的用户
 */