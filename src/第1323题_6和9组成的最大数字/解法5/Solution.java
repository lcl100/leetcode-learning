package 第1323题_6和9组成的最大数字.解法5;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maximum69Number(int num) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(6, 9);
        map.put(9, 9);
        map.put(66, 96);
        map.put(69, 99);
        map.put(96, 99);
        map.put(99, 99);
        map.put(666, 966);
        map.put(669, 969);
        map.put(696, 996);
        map.put(699, 999);
        map.put(966, 996);
        map.put(969, 999);
        map.put(996, 999);
        map.put(999, 999);
        map.put(6666, 9666);
        map.put(6669, 9669);
        map.put(6696, 9696);
        map.put(6699, 9699);
        map.put(6966, 9966);
        map.put(6969, 9969);
        map.put(6996, 9996);
        map.put(6999, 9999);
        map.put(9666, 9966);
        map.put(9669, 9969);
        map.put(9696, 9996);
        map.put(9699, 9999);
        map.put(9966, 9996);
        map.put(9969, 9999);
        map.put(9996, 9999);
        map.put(9999, 9999);
        return map.get(num);
    }
}
/*
    解题思路：
        0.思路来源于别人：https://leetcode-cn.com/problems/maximum-69-number/solution/bao-bao-ye-neng-kan-dong-de-leetcode-ti-jie-3-chon/
        1.直接将所有的可能保存在HashMap中，直接获取即可
    总结：
        1.和解法2一样，都属于取巧，而且很伤眼睛，因为题目限制了数字的范围
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了72.00% 的用户
    内存消耗：35.4 MB, 在所有 Java 提交中击败了40.69% 的用户
 */