package 周赛第5705题_判断国际象棋棋盘中一个格子的颜色.解法1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean squareIsWhite(String coordinates) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.put("f", 6);
        map.put("g", 7);
        map.put("h", 8);
        int x = map.get(String.valueOf(coordinates.charAt(0)));
        int y = Integer.parseInt(String.valueOf(coordinates.charAt(1)));
        return (x + y) % 2 != 0;
    }
}
/*
    解题思路：
        1.采用Map建立字母与数字的映射关系
        2.如果横坐标x加纵坐标y是偶数，则是黑色返回false，是奇数则是白色返回true
 */