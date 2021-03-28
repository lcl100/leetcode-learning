package 第520题_检测大写字母.解法2;

class Solution {
    public boolean detectCapitalUse(String word) {
        /*
            1.word.toUpperCase().equals(word)将字符串word转换成全大写字母，然后与原字符串比较是否相等
            2.word.toLowerCase().equals(word)将字符串word转换成全小写字母，然后与原字符串比较是否相等
            3.(word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase()).equals(word)将word转换成首字母大写其他字母小写的单词，然后与原字符串比较是否相等
         */
        return word.toUpperCase().equals(word) || word.toLowerCase().equals(word) || (word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase()).equals(word);
    }
}
/*
    解题思路：
        0.String的API
 */
/*
    执行用时：3 ms, 在所有 Java 提交中击败了8.09% 的用户
    内存消耗：36.8 MB, 在所有 Java 提交中击败了52.49% 的用户
 */