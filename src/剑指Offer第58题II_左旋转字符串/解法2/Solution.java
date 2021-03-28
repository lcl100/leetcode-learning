package 剑指Offer第58题II_左旋转字符串.解法2;

public class Solution {
    public String reverseLeftWords(String s, int n) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = n; i < chars.length; i++) {
            sb.append(chars[i]);
        }
        for (int i = 0; i < n; i++) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }
}
/*
    解题思路：
        0.循环
        1.循环将字符串中的字符添加到StringBuilder中转换成字符串并返回
 */
/*
    执行用时：3 ms, 在所有 Java 提交中击败了35.27% 的用户
    内存消耗：38.1 MB, 在所有 Java 提交中击败了84.18% 的用户
 */
