package 第1624题_两个相同字符之间的最长子字符串.解法2;

class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max = -1;// 用来存储最长子字符串的长度
        for (char c : s.toCharArray()) {
            // 起始索引
            int firstIndex = s.indexOf(c);
            // 结束索引
            int lastIndex = s.lastIndexOf(c);
            if (firstIndex != lastIndex) {// 如果不相等表示该字符至少出现了2次
                // 只保存最长的子字符串长度
                max = Math.max(lastIndex - firstIndex - 1, max);
            }
        }
        return max;
    }
}
/*
    解题思路：
        0.String的API
        1.使用String类的indexOf()方法可以快速得到一个字符在该字符串中第一次出现的索引，lastIndexOf()方法可以快速得到在该字符串中最后一次的索引
        2.如果两个索引firstIndex和lastIndex不相等，表示该字符至少出现了2次，满足“两个相同字符”的条件
        3.同样，可以根据lastIndex-firstIndex-1求出该字符之间的子字符串的长度
        4.设置一个max变量存储最长子字符串的长度即可
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了78.60% 的用户
    内存消耗：36.7 MB, 在所有 Java 提交中击败了7.60% 的用户
 */