package 第1629题_按键持续时间最长的键.解法1;

class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char[] keys = keysPressed.toCharArray();
        int max = releaseTimes[0];// 记录最大持续时间
        char key = keys[0];// 记录每个字符
        for (int i = 1; i < keys.length; i++) {
            // 得到该字符的持续时间
            int reduce = releaseTimes[i] - releaseTimes[i - 1];
            // 与最大持续时间比较，并且如果相等时就要比较字母顺序
            if (reduce > max || (max == reduce && key < keys[i])) {
                max = reduce;
                key = keys[i];
            }
        }
        return key;
    }
}
/*
    解题思路：
        1.计算每个字母的持续时间，并得到最大持续时间，如果与最大持续时间相等，那么就比较它们的字母顺序
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：38.6 MB, 在所有 Java 提交中击败了48.33% 的用户
 */
