package 第1047题_删除字符串中的所有相邻重复项.解法4;

class Solution {
    public String removeDuplicates(String S) {
        StringBuffer stack = new StringBuffer();
        int top = -1;
        for (int i = 0; i < S.length(); ++i) {
            char ch = S.charAt(i);
            if (top >= 0 && stack.charAt(top) == ch) {
                stack.deleteCharAt(top);
                --top;
            } else {
                stack.append(ch);
                ++top;
            }
        }
        return stack.toString();
    }
}
/*
    解题思路：
        1.官方代码，优化
 */
/*
    执行用时：17 ms, 在所有 Java 提交中击败了59.02% 的用户
    内存消耗：39.1 MB, 在所有 Java 提交中击败了43.53% 的用户
 */
