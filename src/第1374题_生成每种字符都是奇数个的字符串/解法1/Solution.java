package 第1374题_生成每种字符都是奇数个的字符串.解法1;

class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        if (n % 2 == 0) {
            sb.deleteCharAt(0);
            sb.append("b");
        }
        return sb.toString();
    }
}
/*
    解题思路：
        0.单独分为奇数和偶数处理
        1.如果是偶数，那么n可以分为1和n-1；如果是奇数，那么n可以直接是n个相同的字符
        2.注意，如果n为1，那么就单独处理
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了86.85% 的用户
    内存消耗：35.8 MB, 在所有 Java 提交中击败了62.76% 的用户
 */