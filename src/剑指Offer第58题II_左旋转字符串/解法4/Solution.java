package 剑指Offer第58题II_左旋转字符串.解法4;

public class Solution {
    public String reverseLeftWords(String s, int n) {
        char[] chars = s.toCharArray();
        // 三次交换
        reverse(chars, 0, n);
        reverse(chars, n, chars.length);
        reverse(chars, 0, chars.length);
        return new String(chars);
    }

    // 交换chars数组中指定start索引和end索引之间的元素
    private void reverse(char[] chars, int start, int end) {
        for (int i = 0; i < (end - start) / 2; i++) {
            char temp = chars[start + i];
            chars[start + i] = chars[end - 1 - i];
            chars[end - 1 - i] = temp;
        }
    }
}
/*
    解题思路：
        0.经典的三次交换
            例如："abcdefg"   2
            第一次交换："ab"  ——  "ba"
            第二次交换："cdefg"   ——  "gfedc"
            第三次交换："bagfedc" ——  "cdefgab"
 */
/*
    执行用时：4 ms, 在所有 Java 提交中击败了30.33% 的用户
    内存消耗：38.4 MB, 在所有 Java 提交中击败了23.41% 的用户
 */