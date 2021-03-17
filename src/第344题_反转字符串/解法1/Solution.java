package 第344题_反转字符串.解法1;

import java.util.Arrays;

public class Solution {
    public void reverseString(char[] s) {
        int len=s.length;
        for (int i = 0; i <len/2; i++) {
            char c=s[i];
            s[i]=s[len-1-i];
            s[len-1-i]=c;
        }
    }

    public static void main(String[] args) {
        char[] c=new char[]{'h','e','l','l','o'};
        new Solution().reverseString(c);
        System.out.println(Arrays.toString(c));
    }
}
/*
    解题思路：
        1.直接交换数组中对称的元素，如[1,2,3,4]，交换后为[4,3,2,1]
        2.原理和双指针一样
 */