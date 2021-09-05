package 第229题_求众数II.解法1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int n=nums.length/3;
        List<Integer> list = new ArrayList<>();
        for (Integer key : map.keySet()) {
            if (map.get(key) > n) {
                list.add(key);
            }
        }
        return list;
    }
}
/*
    执行用时：17 ms, 在所有 Java 提交中击败了10.32% 的用户
    内存消耗：41.7 MB, 在所有 Java 提交中击败了80.03% 的用户
 */