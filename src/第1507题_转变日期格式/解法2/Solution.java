package 第1507题_转变日期格式.解法2;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String reformatDate(String date) {
        // 13个字符表示天数是两位；12个字符表示天数是一位
        char[] chars = date.toCharArray();
        int len = chars.length;
        StringBuilder sb = new StringBuilder();
        sb.append(concat(chars, len - 4, len - 1)).append("-");
        if (len == 13) {
            sb.append(getMonth(concat(chars, 5, 7))).append("-");
            sb.append(concat(chars, 0, 1));
        } else {
            sb.append(getMonth(concat(chars, 4, 6))).append("-");
            sb.append("0").append(chars[0]);
        }
        // 拼接日期
        return sb.toString();
    }

    // 根据指定的月份英文获取数字月份
    private String getMonth(String month) {
        String[] months = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        Map<String, String> monthMap = new HashMap<>();
        for (int i = 1; i <= months.length; i++) {
            if (i < 10) {
                monthMap.put(months[i - 1], "0" + i);
            } else {
                monthMap.put(months[i - 1], i + "");
            }
        }
        return monthMap.get(month);
    }

    // 将字符串指定索引到指定索引的所有字符拼接成字符串返回，使用方法提升效率
    private String concat(char[] chars, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }
}
/*
    解题思路：
        0.获取指定索引的数组元素，然后拼接
        1.字符串date的长度分为两种情况：13个字符表示天数是两位（如："20th Oct 2052"）；12个字符表示天数是一位（ "6th Jun 1933"）
            - 20表示天数，是chars[0]和chars[1]；6也表示天数，是chars[0]，不过前面要添加一个"0"字符
            - Oct表示英文月份，可以通过哈希表快速获取，月份的英文缩写都是三位，也可以通过索引直接获得
            - 2052表示年份，可以直接获取字符串的最后四位字符，无需作任何处理
    注意事项：
        1.拼接字符串不要使用"+"号，而是考虑使用StringBuilder，这样效率要高些
 */
/*
    执行用时：6 ms, 在所有 Java 提交中击败了75.54% 的用户
    内存消耗：37 MB, 在所有 Java 提交中击败了63.68% 的用户
 */