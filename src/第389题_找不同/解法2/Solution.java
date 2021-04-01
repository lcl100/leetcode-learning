package 第389题_找不同.解法2;

class Solution {
    public char findTheDifference(String s, String t) {
        // 记录每个小写字母的出现次数
        int[] letters = new int[26];
        // 将字符串s和字符串t合并，然后用数组统计字符串中每个字符的出现次数
        for (char c : s.concat(t).toCharArray()) {
            letters[c - 'a']++;
        }
        // 返回数组中出现次数为奇数次的字符
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] % 2 == 1) {
                return (char) (97 + i);
            }
        }
        return ' ';
    }
}
/*
    解题思路：
        0.数组计数
        1.使用数组统计每个小写字母的出现次数，大大提升效率
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：37 MB, 在所有 Java 提交中击败了34.75% 的用户
 */