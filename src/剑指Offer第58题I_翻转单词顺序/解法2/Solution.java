package 剑指Offer第58题I_翻转单词顺序.解法2;

public class Solution {
    public String reverseWords(String s) {
        // 去除字符串中多余的空格（左右两侧的空格和中间超过一个的空格）
        String trim = s.trim();
        String s1 = trim.replaceAll("\\s+", " ");
        // 将字符串按照空格分割成字符串数组
        String[] split = s1.split(" ");
        // 交换字符串数组中对称位置的字符串
        for (int i = 0; i < split.length / 2; i++) {
            String temp = split[i];
            split[i] = split[split.length - i - 1];
            split[split.length - i - 1] = temp;
        }
        // 然后将交换后的数组重新转换成字符串输出
        StringBuilder sb = new StringBuilder();
        for (String str : split) {
            sb.append(str).append(" ");
        }
        return sb.toString().trim();
    }
}
/*
    解题思路：
        0.数组交换对称位置的元素
 */
/*
    执行用时：7 ms, 在所有 Java 提交中击败了24.24% 的用户
    内存消耗：38.8 MB, 在所有 Java 提交中击败了11.66% 的用户
 */