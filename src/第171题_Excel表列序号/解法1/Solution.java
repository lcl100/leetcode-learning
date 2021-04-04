package 第171题_Excel表列序号.解法1;

public class Solution {
    public int titleToNumber(String s) {
        int sum = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            // Math.pow(m,n)表示得到m的n次方这个数
            // s.charAt(i) - 'A' + 1是获得当前大写字母的对应数字
            sum += Math.pow(26, len - 1 - i) * (s.charAt(i) - 'A' + 1);
        }
        return sum;
    }
}
/*
    解题思路：
        1.规律，看如下示例：
             "A"  - (26)^0*1=1
             "AB" - (26)^1*1+(26)^0*2=28
             "ZY" - (26)^1*26+(26)^0*25=701
             "ABC" - (26)^2*1+(26)^1*2+(26)^0*3=731
          其实就类似于十进制：7*10^2+3*10^1+1*10^0=731
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：38.7 MB, 在所有 Java 提交中击败了6.95% 的用户
 */