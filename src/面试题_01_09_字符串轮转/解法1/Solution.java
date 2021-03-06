package 面试题_01_09_字符串轮转.解法1;

public class Solution {
    public boolean isFlipedString(String s1, String s2) {
        // 如果两个字符串的总长度不相等，那么它们一定不能相互轮转
        if (s1.length() != s2.length()) {
            return false;
        }
        return (s2 + s2).contains(s1);
    }
}
/*
    解题思路：
        0.String的API
        1.例如：s1 = "waterbottle", s2 = "erbottlewat"
            s2+s2="erbottlewaterbottlewat"
            会发现s2+s2中包含s1："erbottle waterbottle wat"
    注意事项：
        1.将字符串转换成字符数组排序，比较两个字符串是否相等的思路是错误的
        2.但写的代码能够通过所有的测试用例，但不符合题意，比如"abcd"和"dcba"其实就不符合题意
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：38.2 MB, 在所有 Java 提交中击败了62.84% 的用户
 */