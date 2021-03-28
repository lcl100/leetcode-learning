package 第1189题_气球的最大数量.解法2;

public class Solution {
    public int maxNumberOfBalloons(String text) {
        // 用下面这些变量来统计"balloon"字符串中字符的出现次数
        int balloonCount = 0;
        int bCount = 0;
        int aCount = 0;
        int lCount = 0;
        int oCount = 0;
        int nCount = 0;
        int i = 0;
        while (i < text.length()) {
            char c = text.charAt(i);
            if (c == 'b') {
                bCount++;
            } else if (c == 'a') {
                aCount++;
            } else if (c == 'l') {
                lCount++;
            } else if (c == 'o') {
                oCount++;
            } else if (c == 'n') {
                nCount++;
            }
            i++;
        }
        // 判断"balloon"气球的出现次数
        while (bCount >= 1 && aCount >= 1 && lCount >= 2 && oCount >= 2 && nCount >= 1) {
            balloonCount++;
            bCount--;
            aCount--;
            lCount -= 2;
            oCount -= 2;
            nCount--;
        }
        return balloonCount;
    }
}
/*
    解题思路：
        0.变量计数
 */
/*
    执行用时：5 ms, 在所有 Java 提交中击败了35.03% 的用户
    内存消耗：37 MB, 在所有 Java 提交中击败了73.50% 的用户
 */