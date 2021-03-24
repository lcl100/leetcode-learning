package 剑指Offer第05题_替换空格.解法1;

class Solution {
    public String replaceSpace(String s) {
        return s.replaceAll(" ", "%20");
    }
}
/*
    解题思路：
        0.String的API
        1.直接调用replaceAll()替换所有的空格
 */
/*
    执行用时：3 ms, 在所有 Java 提交中击败了15.62% 的用户
    内存消耗：36.5 MB, 在所有 Java 提交中击败了16.27% 的用户
 */