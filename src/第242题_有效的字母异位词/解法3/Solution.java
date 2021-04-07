package 第242题_有效的字母异位词.解法3;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] sCount = countLetter(s);
        int[] tCount = countLetter(t);
        for (int i = 0; i < 26; i++) {
            if (sCount[i] != tCount[i]) {
                return false;
            }
        }
        return true;
    }

    // 用数组统计字符串str中每个字符的出现次数
    private int[] countLetter(String str) {
        int[] letters = new int[26];
        char[] chars = str.toCharArray();
        for (char c : chars) {
            letters[c - 'a']++;
        }
        return letters;
    }
}
/*
    解题思路：
        0.数组计数
        1.题目中说到字符串只包含小写字母，所以可以创建一个长度为26的数组来统计每个字符的出现次数
 */
/*
    执行用时：2 ms, 在所有 Java 提交中击败了99.98% 的用户
    内存消耗：38.8 MB, 在所有 Java 提交中击败了40.76% 的用户
 */