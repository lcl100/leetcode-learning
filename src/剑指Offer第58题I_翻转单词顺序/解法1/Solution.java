package 剑指Offer第58题I_翻转单词顺序.解法1;

class Solution {
    public String reverseWords(String s) {
        // 去除字符串中多余的空格（左右两侧的空格和中间超过一个的空格）
        String trim = s.trim();
        String s1 = trim.replaceAll("\\s+", " ");
        // 将字符串按照空格分割成字符串数组
        String[] split = s1.split(" ");
        StringBuilder sb = new StringBuilder();
        // 倒序遍历
        for (int i = split.length - 1; i >= 0; i--) {
            sb.append(split[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
/*
    解题思路：
        0.单层for循环
        1.倒序输出数组
 */
/*
    执行用时：7 ms, 在所有 Java 提交中击败了24.24% 的用户
    内存消耗：39 MB, 在所有 Java 提交中击败了10.03% 的用户
 */