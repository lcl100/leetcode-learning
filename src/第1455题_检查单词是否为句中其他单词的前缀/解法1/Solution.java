package 第1455题_检查单词是否为句中其他单词的前缀.解法1;

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] split = sentence.split(" ");
        for (int i = 0; i < split.length; i++) {
            if (split[i].indexOf(searchWord)==0) {
                return i+1;
            }
        }
        return -1;
    }
}
/*
    解题思路：
        0.String的API
        1.将字符串按照空格分割成字符串数组
        2.调用String的indexOf()方法查找searchWord是否是当前字符串的子串并且出现位置是从首位开始的
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36.1 MB, 在所有 Java 提交中击败了90.72% 的用户
 */
