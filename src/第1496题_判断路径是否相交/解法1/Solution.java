package 第1496题_判断路径是否相交.解法1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0, y = 0;
        char[] chars = path.toCharArray();
        Map<String, Integer> map = new HashMap<>();
        map.put("(0,0)", 1);
        for (char c : chars) {
            if (c == 'N') {
                y++;
            } else if (c == 'S') {
                y--;
            } else if (c == 'E') {
                x++;
            } else if (c == 'W') {
                x--;
            }
            String str = "(" + x + "," + y + ")";
            if (map.containsKey(str)) {
                return true;
            } else {
                map.put(str, 1);
            }
        }
        return false;
    }
}
/*
    解题思路：
        0.HashMap
        1.使用Hash记录走过的每一个坐标，然后比较是否有重复坐标，如果有则表示路径相交了
 */
/*
    执行用时：7 ms, 在所有 Java 提交中击败了16.78% 的用户
    内存消耗：38.2 MB, 在所有 Java 提交中击败了49.35% 的用户
 */