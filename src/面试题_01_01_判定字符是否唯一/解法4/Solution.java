package 面试题_01_01_判定字符是否唯一.解法4;

class Solution {
    public boolean isUnique(String astr) {
        if (astr.length() <= 1) {
            return true;
        }
        for (int i = 0; i < astr.length(); i++) {
            char c = astr.charAt(i);
            if (astr.indexOf(c) != astr.lastIndexOf(c)) {
                return false;
            }
        }
        return true;
    }
}
/*
    解题思路：
        0.String的API
        1.利用indexOf()方法和lastIndexOf()方法判断一个字符从正序和倒序查找的索引值是否相等，如果不相等，表示该字符在字符串中至少出现了两次，如果相等表示只出现了一次
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：35.9 MB, 在所有 Java 提交中击败了92.26% 的用户
 */