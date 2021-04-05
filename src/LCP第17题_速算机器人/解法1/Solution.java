package LCP第17题_速算机器人.解法1;

class Solution {
    public int calculate(String s) {
        int x = 1, y = 0;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            /*
                "A" 运算：使 x = 2 * x + y；
                "B" 运算：使 y = 2 * y + x。
             */
            if (c == 'A') {
                x = 2 * x + y;
            } else if (c == 'B') {
                y = 2 * y + x;
            }
        }
        return x + y;
    }
}
/*
    题目解析：
        1.字符串s中只有'A'或者'B'字符
        2.最后只需要返回x+y即可
    解题思路：
        1.循环遍历字符串s中的每个字符
            1.1如果是'A'字符，则将x = 2 * x + y
            1.2如果是'B'字符，则将y = 2 * y + x
        2.最后返回变量x与y的和
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36.3 MB, 在所有 Java 提交中击败了38.69% 的用户
 */