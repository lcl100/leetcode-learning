package 第657题_机器人能否返回原点.解法2;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean judgeCircle(String moves) {
        char[] chars = moves.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char aChar : chars) {
            map.put(aChar, map.getOrDefault(aChar, 0) + 1);
        }
        return map.getOrDefault('U', 0).equals(map.getOrDefault('D', 0)) && map.getOrDefault('L', 0).equals(map.getOrDefault('R', 0));
    }
}
/*
    解题思路：
        0.HashMap计数
        0.解题思路来源于：https://leetcode-cn.com/problems/robot-return-to-origin/solution/san-xing-dai-ma-gao-ding-huan-you-ren-bi-wo-duan-m/
        1.如果机器人只向L或R方向移动，如果在L方向和R方向移动次数相等，那么机器人最终一定会回到原点
        2.同理，在U和D方向移动相同次数，也会回到原点，所以最后只需要比较它们的次数就可以
 */
/*
    执行用时：18 ms, 在所有 Java 提交中击败了6.06% 的用户
    内存消耗：39.3 MB, 在所有 Java 提交中击败了5.04% 的用户
 */
