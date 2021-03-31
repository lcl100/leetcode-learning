package 第383题_赎金信.解法2;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ransomNoteArray = getArray(ransomNote);
        int[] magazineArray = getArray(magazine);
        for (char c : ransomNote.toCharArray()) {
            if (ransomNoteArray[c - 'a'] > magazineArray[c - 'a']) {
                return false;
            }
        }
        return true;
    }

    // 使用数组统计每个字符串中小写字母的出现次数
    private int[] getArray(String str) {
        int[] array = new int[26];
        char[] chars = str.toCharArray();
        for (char c : chars) {
            array[c - 'a']++;
        }
        return array;
    }
}
/*
    解题思路：
        0.数组计数
        1.是解法1的优化
 */
/*
    执行用时：2 ms, 在所有 Java 提交中击败了93.80% 的用户
    内存消耗：39 MB, 在所有 Java 提交中击败了28.25% 的用户
 */