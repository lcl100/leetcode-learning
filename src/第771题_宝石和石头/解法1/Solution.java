package 第771题_宝石和石头.解法1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // 用来统计宝石的数量
        int count = 0;
        // 将字符串转换成字符数组
        char[] chars = jewels.toCharArray();
        // 获取到统计了字符出现次数的Map
        Map<Character, Integer> stonesMap = getMap(stones);
        for (char c : chars) {
            count += stonesMap.getOrDefault(c, 0);
        }
        return count;
    }

    // 统计指定字符串str中各字符的出现次数，并以Map的形式返回
    private Map<Character, Integer> getMap(String str) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            map.put(aChar, map.getOrDefault(aChar, 0) + 1);
        }
        return map;
    }
}
/*
    解题思路：
        0.HashMap计数
        1.用HashMap统计字符串stones中每个字符的出现次数
        2.遍历给定的jewels字符串中的每个字符，然后去Map中查找该字符的出现次数，相加返回总和
 */
/*
    执行用时：2 ms, 在所有 Java 提交中击败了43.06% 的用户
    内存消耗：37 MB, 在所有 Java 提交中击败了18.40% 的用户
 */