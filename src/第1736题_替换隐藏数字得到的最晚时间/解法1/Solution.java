package 第1736题_替换隐藏数字得到的最晚时间.解法1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String maximumTime(String time) {
        Map<String, String> hourMap = new HashMap<>();
        Map<String, String> minuteMap = new HashMap<>();
        // 处理小时
        // 处理第一位
        hourMap.put("?0", "20");
        hourMap.put("?1", "21");
        hourMap.put("?2", "22");
        hourMap.put("?3", "23");
        hourMap.put("?4", "14");
        hourMap.put("?5", "15");
        hourMap.put("?6", "16");
        hourMap.put("?7", "17");
        hourMap.put("?8", "18");
        hourMap.put("?9", "19");
        // 处理第二位
        hourMap.put("0?", "09");
        hourMap.put("1?", "19");
        hourMap.put("2?", "23");
        // 处理两位都是问号的情况
        hourMap.put("??", "23");
        // 处理分钟
        // 处理第一位
        minuteMap.put("?0", "50");
        minuteMap.put("?1", "51");
        minuteMap.put("?2", "52");
        minuteMap.put("?3", "53");
        minuteMap.put("?4", "54");
        minuteMap.put("?5", "55");
        minuteMap.put("?6", "56");
        minuteMap.put("?7", "57");
        minuteMap.put("?8", "58");
        minuteMap.put("?9", "59");
        // 处理第二位
        minuteMap.put("0?", "09");
        minuteMap.put("1?", "19");
        minuteMap.put("2?", "29");
        minuteMap.put("3?", "39");
        minuteMap.put("4?", "49");
        minuteMap.put("5?", "59");
        // 处理两位都是问号的情况
        minuteMap.put("??", "59");

        // 将字符串按":"分割成两个字符串
        String[] split = time.split(":");
        // 需要判断分割后的小时字符串中是否包含"?"，如果不包含，直接返回原值即可
        String hour = split[0].contains("?") ? hourMap.get(split[0]) : split[0];
        String minute = split[1].contains("?") ? minuteMap.get(split[1]) : split[1];
        return hour + ":" + minute;
    }
}
/*
    解题思路：
        0.字典表
        1.由于小时和分钟的范围是有限的，所以可以制定一张字典表，直接查询即可
             00:00 ~ 23:59
             第一位的范围：0~2 ——  [0,1,2]
             第二位的范围：0~3 ——  [0,1,2,3]
                        注：当第一位数是0或1时，第二位的范围是0~9
             第三位的范围：0~5 ——  [0,1,2,3,4,5]
             第四位的范围：0~9 ——  [0,1,2,3,4,5,6,7,8,9]
 */
/*
    执行用时：7 ms, 在所有 Java 提交中击败了17.91% 的用户
    内存消耗：37.2 MB, 在所有 Java 提交中击败了8.80% 的用户
 */