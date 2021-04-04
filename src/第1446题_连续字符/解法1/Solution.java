package 第1446题_连续字符.解法1;

class Solution {
    public int maxPower(String s) {
        int maxCount = 0;// 计数器，记录每个字符的出现次数
        int i = 0, j = 0;// 双指针
        while (j < s.length()) {
            // 如果遇到与s.charAt(i)相同的字符，直接跳到下一个字符继续比较
            while (j < s.length() && s.charAt(j) == s.charAt(i)) {
                j++;
            }
            maxCount = Math.max(maxCount, j - i);// 计算最大出现次数
            i = j;// 更新i指针
        }
        return maxCount;
    }
}
/*
    解题思路：
        0.双指针
        1.用双指针统计每个字符的出现次数，最后返回最大出现次数
 */
/*
    执行用时：2 ms, 在所有 Java 提交中击败了32.01% 的用户
    内存消耗：37.2 MB, 在所有 Java 提交中击败了54.73% 的用户
 */