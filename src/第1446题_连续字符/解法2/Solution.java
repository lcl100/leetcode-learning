package 第1446题_连续字符.解法2;

class Solution {
    public int maxPower(String s) {
        // "abbcccddddeeeeedcba"   ——>    a-bb-ccc-dddd-eeeee-d-c-b-a
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        sb.append(chars[0]);
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != chars[i - 1]) {
                sb.append("-");// 这里用"-"进行分割，也可以用其他字符分隔
            }
            sb.append(chars[i]);
        }
        // 找出最长长度
        String[] split = sb.toString().split("-");
        int maxLen = 0;
        for (String str : split) {
            maxLen = Math.max(maxLen, str.length());
        }
        return maxLen;
    }
}
/*
    解题思路：
        1.将不同字符用"-"分隔开，然后分割成字符串数组，返回最长长度即可
        2.该解法效率不高
 */
/*
    执行用时：7 ms, 在所有 Java 提交中击败了5.68% 的用户
    内存消耗：38.9 MB, 在所有 Java 提交中击败了5.11% 的用户
 */