package 第1684题_统计一致字符串的数目.解法4;

public class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        // 用bits变量存储allowed字符串中每个小写字母的出现状态
        int bits = 0;
        for (char c : allowed.toCharArray()) {
            int n = c - 'a';// 计算c字符应该放的位置
            bits |= (1 << n);// 1<<n表示将0000 0001向左移n位，再与bits的二进制参加"&"运算
        }
        // 用来判断一致字符串的个数
        int wordCount = 0;// 计数器，记录一致字符串的个数
        for (String word : words) {// 循环遍历words数组
            boolean flag = true;// 标记，记录当前遍历的字符串word是否是一致字符串
            for (char c : word.toCharArray()) {// 遍历当前字符串word中的每个字符
                // (bits & (1 << (c - 'a'))) == 0   用来判断该字符是否在bits中出现过，如果为0，表示该字符没有出现过，不为0表示该字符在bits中出现过
                if ((bits & (1 << (c - 'a'))) == 0) {
                    flag = false;
                    break;
                }
            }
            // 判断flag标记，用来记录一致字符串的个数
            if (flag) {
                wordCount++;
            }
        }
        return wordCount;
    }
}
/*
    解题思路：
        0.用二进制位来记录该字符是否出现，如果二进制位为1则表示该字符出现过，如果为0表示没有出现
        1.解题思路和解法1、2、3思路本质上都是一样的，就是记录字符是否出现过
        2.int类型的变量是32位，可以采用后26位来记录一个字符的出现状态，比如000...0001表示'a'字符出现过，000...0010表示'b'字符出现过

 */
/*
    执行用时：7 ms, 在所有 Java 提交中击败了91.55% 的用户
    内存消耗：39.7 MB, 在所有 Java 提交中击败了27.11% 的用户
 */