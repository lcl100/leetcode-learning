package 第1784题_检查二进制字符串字段.解法2;

class Solution {
    public boolean checkOnesSegment(String s) {
        return s.matches("1+0*");
    }

    public static void main(String[] args) {
        System.out.println(new Solution().checkOnesSegment("1"));
    }
}
/*
    解题思路：
        1.用正则表达式进行匹配，"1+"表示1出现一次或多次，"0*"表示0出现零次或多次
 */
