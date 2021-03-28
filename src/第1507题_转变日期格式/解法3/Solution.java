package 第1507题_转变日期格式.解法3;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String reformatDate(String date) {
        String[] split = date.split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(split[2]).append("-");
        sb.append(getMonth(split[1])).append("-");
        String day = split[0].substring(0, split[0].length() - 2);
        sb.append(split[0].length() == 4 ? day : ("0" + day));
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

}
/*
    解题思路：
        0.String的API
 */
/*
    执行用时：5 ms, 在所有 Java 提交中击败了79.42% 的用户
    内存消耗：36.9 MB, 在所有 Java 提交中击败了73.85% 的用户
 */