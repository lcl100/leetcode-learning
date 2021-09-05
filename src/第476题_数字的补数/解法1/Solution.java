package 第476题_数字的补数.解法1;

class Solution {
    public int findComplement(int num) {
        // 将数转换成二进制字符串
        String str = Integer.toBinaryString(num);
        // 循环遍历二进制字符串的字符数组
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            // 将'1'字符改成'0'字符，'0'字符改成'1'字符
            chars[i] = chars[i] == '1' ? '0' : '1';
        }
        // 将二进制字符串改成十进制数字
        return Integer.parseInt(String.valueOf(chars), 2);
    }
}
/*
    解题思路：
        0.数转字符串
        1.将数字转换成二进制字符串，然后再转换成字符数组
        2.遍历字符数组，将'1'字符置为'0'字符，'0'字符置为'1'字符
        3.最后将字符数组转换成字符串，再转换成十进制数字
 */