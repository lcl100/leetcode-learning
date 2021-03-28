package 第434题_字符串中的单词数.解法3;

public class Solution {
    public int countSegments(String s) {
        // 将段落s按照空格分割成字符串数组
        String[] split = s.split(" ");
        int segmentCount = 0;// 计数器，记录单词的个数
        // 循环遍历字符串数组
        for (String str : split) {
            // 判断遍历的str是否是一个有效的单词，只要字符串长度大于0就表示是一个有效的单词
            if (str.length() > 0) {
                segmentCount++;
            }
        }
        return segmentCount;
    }
}
/*
    解题思路：
        0.统计字符个数大于的单词个数
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36.2 MB, 在所有 Java 提交中击败了53.04% 的用户
 */