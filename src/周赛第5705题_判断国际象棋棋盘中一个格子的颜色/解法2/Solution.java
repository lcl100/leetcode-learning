package 周赛第5705题_判断国际象棋棋盘中一个格子的颜色.解法2;

public class Solution {
    public boolean squareIsWhite(String coordinates) {
        int x = coordinates.charAt(0) - 'a' + 1;
        int y = Integer.parseInt(String.valueOf(coordinates.charAt(1)));
        return (x + y) % 2 != 0;
    }
}
/*
    解题思路：
        1.解法1的优化，利用ASCII码值映射
 */