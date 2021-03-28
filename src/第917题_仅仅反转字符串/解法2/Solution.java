package 第917题_仅仅反转字符串.解法2;

public class Solution {
    public String reverseOnlyLetters(String S) {
        char[] chars = S.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            while (i < chars.length && i < j && !isLetter(chars[i])) {
                i++;
            }
            while (j >= 0 && i < j && !isLetter(chars[j])) {
                j--;
            }
            if (i < chars.length && j >= 0 && isLetter(chars[i]) && isLetter(chars[j])) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
        }
        return String.valueOf(chars);
    }

    private boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
}
/*
    解题思路：
        0.双指针
        1.正序指针和倒序指针判断是否是字母，如果是则进行交换
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36.7 MB, 在所有 Java 提交中击败了49.58% 的用户
 */