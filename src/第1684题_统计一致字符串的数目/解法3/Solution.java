package 第1684题_统计一致字符串的数目.解法3;

public class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] letters = new int[26];
        for (char c : allowed.toCharArray()) {
            letters[c - 'a']++;
        }
        // 判断一致字符串的个数
        int wordCount = 0;
        for (String word : words) {
            boolean flag = true;// 标记，判断word字符串是否是一致字符串
            for (char c : word.toCharArray()) {
                if (letters[c - 'a'] == 0) {
                    flag = false;// 如果某字符不包含在set中，表示当前字符串不是一致字符串，那么将标记flag置为false
                    break;
                }
            }
            if (flag) {// 如果flag为真表示当前字符串是一致字符串，则计数器加1
                wordCount++;
            }
        }
        return wordCount;
    }
}
/*
    解题思路：
        0.数组计数
        1.同解法1和解法2思路一致，不过使用了数组来记录字符的出现，因为题目中明确说明了字符串中都是小写字母
 */
/*
    执行用时：7 ms, 在所有 Java 提交中击败了91.55% 的用户
    内存消耗：39.3 MB, 在所有 Java 提交中击败了48.61% 的用户
 */