package 第1736题_替换隐藏数字得到的最晚时间.解法2;

public class Solution {
    public String maximumTime(String time) {
        char[] chars = time.toCharArray();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < chars.length) {
            if (chars[i] != '?') {
                sb.append(chars[i]);
            } else {
                if (i == 0 && chars[1] <= '3') {
                    sb.append("2");
                } else if (i == 0 && chars[1] <= '9') {
                    sb.append("1");
                } else if (chars[0] == '2' && i == 1) {
                    sb.append("3");
                } else if (chars[0] != '2' && i == 1) {
                    sb.append("9");
                } else if (i == 3) {
                    sb.append("5");
                } else if (i == 4) {
                    sb.append("9");
                } else if (chars[0] == '?' && chars[1] == '?') {
                    sb.append("23");
                    i++;
                } else if (chars[3] == '?' && chars[4] == '?') {
                    sb.append("59");
                    i++;
                }
            }
            i++;
        }
        return sb.toString();
    }
}
/*
    解题思路：
        0.多重条件判断
        1.其实本质上同解法1一样，都是属于限定了范围的解决方式
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了49.42% 的用户
    内存消耗：36.5 MB, 在所有 Java 提交中击败了98.15% 的用户
 */

