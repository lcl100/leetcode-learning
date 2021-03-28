package 第1507题_转变日期格式.解法4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Solution {
    public String reformatDate(String date) {
        return LocalDate.parse(date.replaceFirst("st|nd|rd|th", ""), DateTimeFormatter.ofPattern("d MMM yyyy")).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}
/*
    解题思路：
        1.代码来源于别人的评论：https://leetcode-cn.com/problems/reformat-date/comments/847860
 */
/*
    执行用时：34 ms, 在所有 Java 提交中击败了8.47% 的用户
    内存消耗：40.1 MB, 在所有 Java 提交中击败了5.09% 的用户
 */