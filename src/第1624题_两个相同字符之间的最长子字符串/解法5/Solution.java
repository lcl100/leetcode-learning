package 第1624题_两个相同字符之间的最长子字符串.解法5;

class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        char[] chars = s.toCharArray();
        int max = -1;
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    max = Math.max(max, j - i - 1);
                }
            }
        }
        return max;
    }
}
/*
    解题思路：
        0.双层for循环，暴力破解
 */
/*
    执行用时：2 ms, 在所有 Java 提交中击败了46.05% 的用户
    内存消耗：36.8 MB, 在所有 Java 提交中击败了6.67% 的用户
 */