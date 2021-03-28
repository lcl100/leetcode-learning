package 第1507题_转变日期格式.解法1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String reformatDate(String date) {
        // 获取年份
        String year = date.substring(date.lastIndexOf(" ") + 1);
        // 获取月份
        String month = getMonth(date.substring(date.indexOf(" ") + 1, date.lastIndexOf(" ")));
        // 获取天数
        String da = date.substring(0, date.indexOf(" ") - 2);
        String day = da.length() > 1 ? da : "0" + da;
        // 拼接日期
        return year + "-" + month + "-" + day;
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
}
/*
    解题思路：
        0.String的API
 */
/*
    执行用时：10 ms, 在所有 Java 提交中击败了53.27% 的用户
    内存消耗：37 MB, 在所有 Java 提交中击败了58.11% 的用户
 */