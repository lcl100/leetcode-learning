package 第1678题_设计Goad解析器.解法2;

class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        char[] chars = command.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'G') {// "G"直接添加
                sb.append("G");
            } else if ((i + 1) < chars.length && chars[i] == '(' && chars[i + 1] == ')') {// 转换"()"到"o"
                sb.append("o");
            } else if ((i + 1) < chars.length && chars[i] == '(' && chars[i + 1] == 'a') {// 转换"(al)"到"al"
                sb.append("al");
            }
        }
        return sb.toString();
    }
}
/*
    解题思路：
        0.逐个字符比较
        1.用StringBuilder来存放需要的字符
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了74.57% 的用户
    内存消耗：36.9 MB, 在所有 Java 提交中击败了16.73% 的用户
 */