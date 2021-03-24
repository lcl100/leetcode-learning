package 第1556题_千位分隔数.解法2;

public class Solution {
    public String thousandSeparator(int n) {
        if (n < 1000) {
            return n + "";
        }
        StringBuilder sb = new StringBuilder();
        int count = 0;// 计数器，记录当前是第几位了，每三位要加一个句点
        while (n > 0) {
            count++;
            sb.append(n % 10);
            if (count != 0 && count % 3 == 0 && n / 10 != 0) {// 首位和末位不用加句点
                sb.append(".");
            }
            n /= 10;
        }
        return sb.reverse().toString();
    }
}
/*
    解题思路：
        0.数逐位计算
 */
/*
    执行用时：6 ms, 在所有 Java 提交中击败了17.67% 的用户
    内存消耗：35.8 MB, 在所有 Java 提交中击败了40.75% 的用户
 */