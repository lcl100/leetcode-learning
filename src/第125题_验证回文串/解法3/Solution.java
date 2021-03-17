package 第125题_验证回文串.解法3;

public class Solution {
    public boolean isPalindrome(String s) {
        // 1.忽略大小写
        String ignoredUpperStr = s.toUpperCase();
        // 2.只要字母或数字
        StringBuilder sb = new StringBuilder();
        char[] charArray = ignoredUpperStr.toCharArray();
        for (char c : charArray) {
            if (c >= '0' && c <= '9' || c >= 'A' && c <= 'Z') {
                sb.append(c);
            }
        }
        // 3.调用API判断
        // sb.reverse()就是将字符串反转，然后比较反转后的字符串和原字符串是否相等
        return sb.toString().equals(sb.reverse().toString());
    }
}
/*
    解题思路：
        1.调用StringBuilder的reverse()方法将字符串反转
        2.然后比较反转后的字符串是否等于原字符串
 */