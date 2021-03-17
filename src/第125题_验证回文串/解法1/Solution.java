package 第125题_验证回文串.解法1;

public class Solution {
    public boolean isPalindrome(String s) {
        // 1.忽略大小写
        String ignoredUpperStr = s.toUpperCase();
        // 2.只要字母或数字
        StringBuilder sb=new StringBuilder();
        char[] charArray = ignoredUpperStr.toCharArray();
        for (char c : charArray) {
            if(c>='0'&&c<='9'||c>='A'&&c<='Z'){
                sb.append(c);
            }
        }
        // 3.将处理完成后的新字符串转换成字符数组
        char[] chars =sb.toString().toCharArray();
        if(chars.length==1){// 如果只有一个字符直接返回true
            return true;
        }
        // 4.判断新字符串是否是回文字符串
        int len=chars.length;
        for (int i = 0; i < len/2; i++) {
            if(chars[i]!=chars[len-1-i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome("a."));
    }
}
/*
    解题思路：
        0.前面的步骤都是处理字符串的非必要元素
        1.从数组的首位置和尾位置向中间遍历，比较值是否相等，如果不相等则返回false表示不是回文字符串
 */