package 第1556题_千位分隔数.解法3;

public class Solution {
    public String thousandSeparator(int n) {
        // 1.将字符串反转成第一次
        StringBuilder sb = new StringBuilder(n + "");
        String s = sb.reverse().toString();
        // 2.将字符串在指定位置加句点并反转第二次
        StringBuilder newSb = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            newSb.append(s.charAt(i));
            if ((i + 1) % 3 == 0 && (i + 1) != s.length()) {
                newSb.append(".");
            }
            i++;
        }
        return newSb.reverse().toString();
    }
}
/*
    解题思路：
        0.解法1的变种
        1.直接将字符串翻转两次，例如原数是：1234
            第一次反转：4321
            加句点：   432.1
            第二次反转：1.234
 */
/*
    执行用时：5 ms, 在所有 Java 提交中击败了22.34% 的用户
    内存消耗：36.2 MB, 在所有 Java 提交中击败了11.90% 的用户
 */
