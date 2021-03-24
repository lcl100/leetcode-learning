package LCP第06题_拿硬币.解法2;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int minCount(int[] coins) {
        // 将所有可能放到HashMap中
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 1);
        map.put(3, 2);
        map.put(4, 2);
        map.put(5, 3);
        map.put(6, 3);
        map.put(7, 4);
        map.put(8, 4);
        map.put(9, 5);
        map.put(10, 5);
        // 直接根据键获取求和
        int count = 0;
        for (int coin : coins) {
            count += map.get(coin);
        }
        return count;
    }
}
/*
    解题思路：
        0.字典表
        1.由于coins[i]在题目种指定了范围：1<=coins[i]<=10
        2.所以将它们的可能需要次数放到HashMap中，直接循环遍历得到即可
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：35.8 MB, 在所有 Java 提交中击败了33.99% 的用户
 */
