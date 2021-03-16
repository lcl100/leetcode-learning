package 第1287题_有序数组中出现次数超过百分之25的元素.解法1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Solution {
    public int findSpecialInteger(int[] arr) {
        // 1.循环遍历数组arr，统计每个数的出现次数并存放在HashMap中
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                Integer val = map.get(i);
                val++;
                map.put(i, val);
            } else {
                map.put(i, 1);
            }
        }
        // 2.判断那个数的出现次数大于25%并返回
        Set<Integer> set = map.keySet();
        double limit = arr.length /4;
        for (Integer key : set) {
            if (map.get(key) > limit) {
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().findSpecialInteger(new int[]{1, 2, 2, 6, 6, 6, 6, 7, 10}));
    }
}
/*
    解题思路：
        1.先循环遍历数组arr，然后将每个元素的出现次数添加到HashMap中，其中键为不重复元素，值为该元素的出现次数
        2.然后循环遍历HashMap，判断哪个元素的出现次数大于25%，则返回该元素
 */