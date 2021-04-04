package 第171题_Excel表列序号.解法2;

public class Solution {
    public int titleToNumber(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum = sum * 26 + (s.charAt(i) - 'A' + 1);
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
          其实就类似于十进制：
                          7*10^2+3*10^1+1*10^0=731
                          10*(7*10^1+3*10^0)+1=731
                          10*(10*(7*10^0)+3)+1=731
                          10*(10*(7)+3)+1=731
          同样，转换成26进制也是一样：
                          26*(26^1*1+26^0*2)+3=731
                          26*(26*(1*26^0)+2)+3=731
                          26*(26*(1)+2)+3=731
       2.关于这个讲解，这篇不错：https://leetcode-cn.com/problems/excel-sheet-column-number/solution/xiang-xi-tong-su-de-si-lu-fen-xi-duo-jie-fa-by-4-3/
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：38.4 MB, 在所有 Java 提交中击败了64.82% 的用户
 */