package 面试题_01_01_判定字符是否唯一.解法2;

class Solution {
    public boolean isUnique(String astr) {
        // 创建一个存储26个小写字母出现次数的数组
        int[] letters = new int[26];
        char[] chars = astr.toCharArray();
        for (char c : chars) {
            if (letters[c - 'a'] != 0) {
                return false;
            }
            letters[c - 'a']++;
        }
        return true;
    }
}
/*
    解题思路：
        0.数组计数
    特别注意：
        1.注意，该题并没有明确说明所有的字符是小写字母，所以上面的数组是有问题的，但上面的代码仍然可以通过，这是存在漏洞的
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36.3 MB, 在所有 Java 提交中击败了28.82% 的用户
 */