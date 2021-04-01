package 第389题_找不同.解法6;

public class Solution {
    public char findTheDifference(String s, String t) {
        int As = 0;
        for (char c : s.toCharArray()) {
            As += c;
        }
        int Ts = 0;
        for (char c : t.toCharArray()) {
            Ts += c;
        }
        return (char) (Ts - As);
    }
}
/*
    解题思路：
        0.数学
        1.将字符串s中每个字符的 ASCII 码的值求和，得到As
        2.将字符串t中每个字符的 ASCII 码的值求和，得到Ts
        3.最后它们的差值所代表的字符就是要返回的字符
    注：
        1.解题思路来源于官方题解：https://leetcode-cn.com/problems/find-the-difference/solution/zhao-bu-tong-by-leetcode-solution-mtqf/
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：37.2 MB, 在所有 Java 提交中击败了9.70% 的用户
 */