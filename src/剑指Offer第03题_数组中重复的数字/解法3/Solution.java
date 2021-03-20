package 剑指Offer第03题_数组中重复的数字.解法3;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findRepeatNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                return num;
            } else {
                map.put(num, 1);
            }
        }
        return -1;
    }
}
/*
    解题思路：
        0.HashMap
        1.直接利用HashMap的containsKey()方法检测是否已经存在该值，然后返回
    注意事项:
        0.比解法2稍微高效一倍左右
 */
/*
    执行用时：9 ms, 在所有 Java 提交中击败了16.28% 的用户
    内存消耗：47.4 MB, 在所有 Java 提交中击败了29.12% 的用户
 */