package 第1736题_替换隐藏数字得到的最晚时间.解法3;

public class Solution {
    public String maximumTime(String time) {
        char[] chars = time.toCharArray();
        // 小时的十位和个位会相互影响
        if (chars[0] == '?') {
            // 如果小时的个位取值为[4,9]那么十位最大为'1'
            // 如果小时的个位取值为[0,3]那么十位最大为'2'
            chars[0] = chars[1] >= '4' && chars[1] <= '9' ? '1' : '2';
        }
        if (chars[1] == '?') {
            // 如果小时的十位取值为'0'或'1'那么个位最大为'9'
            // 如果小时的十位取值为'2'那么个位最大为'3'
            chars[1] = chars[0] <= '1' ? '9' : '3';
        }
        // 分钟往最大的数取值
        if (chars[3] == '?') {
            chars[3] = '5';
        }
        if (chars[4] == '?') {
            chars[4] = '9';
        }
        return new String(chars);
    }
}
/*
    解题思路：
        1.算是解法2的优化，至少结构看起来要清晰些
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了49.42% 的用户
    内存消耗：36.9 MB, 在所有 Java 提交中击败了24.86% 的用户
 */
