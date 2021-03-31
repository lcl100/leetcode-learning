package 第1678题_设计Goad解析器.解法3;

public class Solution {
    public String interpret(String command) {
        char[] chars = command.toCharArray();
        int m = 0;// 原地修改原数组chars，记录要修改的索引位置，从0开始重新填值
        int i = 0;
        while (i < chars.length) {
            if (chars[i] == 'G') {
                chars[m] = 'G';
                m++;
                i++;
            } else if (chars[i] == '(') {
                i++;
            } else if (chars[i] == ')') {
                chars[m] = 'o';
                m++;
                i++;
            } else if (chars[i] == 'a') {
                chars[m] = 'a';
                m++;
                chars[m] = 'l';
                m++;
                i += 3;
            }
        }
        return String.valueOf(chars, 0, m);
    }
}
/*
    解题思路：
        0.原地修改数组
        1.如"G()()()()(al)"转换成字符数组遍历每个字符
            - 如果是'G'字符，则将chars[m]='m'（注意：m++），并且i跳转到下一个字符（i++）
            - 如果是'('字符，则i跳转到下一个字符（i++）
            - 如果是')'字符，表明出现了"()"，那么将chars[m]='o'（注意：m++），并且i跳转到下一个字符（i++）
            - 如果是'a'字符，表明出现了"(al)"，那么将chars[m]='a'（注意：m++）,chars[m]='l'（注意：m++），注意，这里i需要跳三个字符（i+=3），因为不再需要匹配'l'和')'字符了
        2.最后直接返回chars数组中从0到m索引的所有元素即可
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了74.57% 的用户
    内存消耗：36.6 MB, 在所有 Java 提交中击败了73.80% 的用户
 */