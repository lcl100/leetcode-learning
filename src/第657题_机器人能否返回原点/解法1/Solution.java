package 第657题_机器人能否返回原点.解法1;

class Solution {
    public boolean judgeCircle(String moves) {
        char[] chars = moves.toCharArray();
        int x = 0, y = 0;// 原点的坐标
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == 'U') {
                y--;
            } else if (c == 'D') {
                y++;
            } else if (c == 'L') {
                x--;
            } else if (c == 'R') {
                x++;
            }
        }
        return x == 0 && y == 0;
    }
}
/*
    解题思路：
        0.解题思路来源于官方题解：https://leetcode-cn.com/problems/robot-return-to-origin/solution/ji-qi-ren-neng-fou-fan-hui-yuan-dian-by-leetcode-s/
        1.这道题跟机器人走哪个方向无关，只需要判断坐标是否回到原点（0,0）
            - 起始坐标，即原点设置为(0,0)
            - 如果指令是U，则令y=y-1
            - 如果指令是D，则令y=y+1
            - 如果指令是L，则令x=x-1
            - 如果指令是R，则令x=x+1
            - 最后判断(x,y)是否为(0,0)即可
 */
/*
    执行用时：5 ms, 在所有 Java 提交中击败了92.86% 的用户
    内存消耗：38.4 MB, 在所有 Java 提交中击败了69.43% 的用户
 */
