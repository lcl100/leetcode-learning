package 剑指Offer第58题II_左旋转字符串.解法3;

public class Solution {
    public String reverseLeftWords(String s, int n) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < n; i++) {
            char c = chars[0];
            if (s.length() - 1 >= 0) {
                System.arraycopy(chars, 1, chars, 0, s.length() - 1);
            }
            chars[s.length() - 1] = c;
        }
        return new String(chars);
    }
}
/*
    解题思路：
        0.暴力破解
        1.将第一个字符之后的所有字符向前移动一个位置，然后将空出来的位置赋予值为第一个位置的值，然后循环移动n次
 */
/*
    执行用时：48 ms, 在所有 Java 提交中击败了8.10% 的用户
    内存消耗：38 MB, 在所有 Java 提交中击败了89.55% 的用户
 */