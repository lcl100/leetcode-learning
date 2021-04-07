package 第258题_各位相加.解法1;

class Solution {
    public int addDigits(int num) {
        // 将数num转换成字符串来处理
        String s = String.valueOf(num);
        // 如果字符串的长度大于1就一直循环下来，直到结果为一位数
        while (s.length() > 1) {
            // 计算字符串s中各数字字符的总和
            // 例如："128"中sum=1+2+8=11
            int sum = 0;
            // 循环遍历s字符串计算各数字加起来的和
            for (char c : s.toCharArray()) {
                // c是字符'0'到'9'，所以可以通过ASCII码值来计算
                sum += c - '1' + 1;
            }
            // 然后将新计算出来的num转换成字符串赋给s，继续循环
            s = String.valueOf(sum);
        }
        // 最后返回转换成整数的s
        return Integer.parseInt(s);
    }
}
/*
    解题思路：
        1.将数转换成字符串s来计算每位的和
        2.然后将计算出来的和又赋给字符串s
        3.一直计算，直到字符串s的长度为1为止
 */
/*
    执行用时：2 ms, 在所有 Java 提交中击败了12.65% 的用户
    内存消耗：36 MB, 在所有 Java 提交中击败了5.11% 的用户
 */