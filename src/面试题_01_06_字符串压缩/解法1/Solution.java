package 面试题_01_06_字符串压缩.解法1;

class Solution {
    public String compressString(String S) {
        // 单独处理空字符串
        if (S.equals("")) {
            return "";
        }
        // 双指针，i记录重复字符子串的起始索引，j记录重复字符子串的结束索引，它们的差值是字符串子串中的字符个数
        int i = 0, j = 0;
        StringBuilder sb = new StringBuilder();
        char[] chars = S.toCharArray();// 转换成字符数组，比charAt()方法效率高
        while (j < S.length()) {
            char ci = chars[i];
            char cj = chars[j];
            if (ci != cj) {
                sb.append(ci).append(j - i);
                i = j;// 重置i指针的索引
            }
            j++;
        }
        // 处理收尾，如"aabbccaaa"最后的几个重复字符"aaa"
        if (j == S.length() && S.charAt(i) == S.charAt(j - 1)) {
            sb.append(S.charAt(i)).append(j - i);
        }
        return sb.toString().length() >= S.length() ? S : sb.toString();
    }
}
/*
    解题思路：
        0.双指针计数
 */
/*
    执行用时：4 ms, 在所有 Java 提交中击败了81.38% 的用户
    内存消耗：38.3 MB, 在所有 Java 提交中击败了47.94% 的用户
 */