package 第728题_自除数.解法1;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        // 循环遍历[left,right]中所有数字（包括边界）
        for (int i = left; i <= right; i++) {
            // 调用isDivisor()方法判断该数是否是自除数，如果是则添加到List
            if (isDivisor(i)) {
                list.add(i);
            }
        }
        return list;
    }

    // 判断一个数是否是自除数
    private boolean isDivisor(int num) {
        // 将数转换成字符串来处理
        String s = String.valueOf(num);
        // 计数器，统计num中能够被num整除的位数，例如：128中1、2、8都能够被128除尽，所以count为3
        int count = 0;
        // 循环遍历字符串s中的每个字符
        for (char c : s.toCharArray()) {
            // '0'字符不被包括在内
            if (c != '0') {
                // 将字符c转换成数字
                int n = Integer.valueOf(String.valueOf(c));
                // 判断数字n能否被num除尽
                if (num % n == 0) {
                    count++;// 如果能够除尽，则计数器count加1
                }
            }
        }
        // 最后判断count是否等于字符串s的长度，如果相等则表示该数是自除数，否则不是
        return count == s.length();
    }
}
/*
    解题思路：
        1.本题的难点在于获取数字的每一位，如128的个位8、十位2和百位1
        2.本解法中将数字转换成字符串来获取数字的每一位
 */
/*
    执行用时：9 ms, 在所有 Java 提交中击败了14.04% 的用户
    内存消耗：38.7 MB, 在所有 Java 提交中击败了8.06% 的用户
 */