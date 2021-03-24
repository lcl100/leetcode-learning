package 第1556题_千位分隔数.解法1;

class Solution {
    public String thousandSeparator(int n) {
        // 小于1000的数直接返回即可
        if (n < 1000) {
            return n + "";
        }
        StringBuilder sb = new StringBuilder();
        String s = n + "";
        int count = 0;
        int i = s.length() - 1;
        while (i >= 0) {
            count++;
            sb.append(s.charAt(i));
            if (count!=0&&count % 3 == 0&&count!=s.length()) {
                sb.append(".");
            }
            i--;
        }
        return sb.reverse().toString();
    }
}
/*
    解题思路：
        0.数转换成字符串
 */
/*
    执行用时：5 ms, 在所有 Java 提交中击败了22.04% 的用户
    内存消耗：35.9 MB, 在所有 Java 提交中击败了24.74% 的用户
 */