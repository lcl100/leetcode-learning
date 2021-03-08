package 第1331题_数组序号转换.解法2;

import java.util.*;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        // 1. 将所有元素添加到Set集合中，完成去重
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        // 2. 将去重后的元素进行排序确定每个元素对应的序号位置
        Integer[] ts = set.toArray(new Integer[set.size()]);
        Arrays.sort(ts);
        // 3. 将元素添加到HashMap中，键对应数字，值对应序号
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < ts.length; i++) {
            map.put(ts[i], i + 1);
        }
        // 4. 将数组arr元素作为键去访问HashMap得到对应的序号重新填充arr
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }
        // 5. 返回序号数组
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().arrayRankTransform(new int[]{37, 12, 28, 9, 100, 56, 80, 5, 12})));
    }
}
/*
    解题思路（效率比解法1高）：
        1. 将所有元素添加到Set集合中，完成去重
        2. 将去重后的元素进行排序确定每个元素对应的序号位置
        3. 将元素添加到HashMap中，键对应数字，值对应序号
        4. 将数组arr元素作为键去访问HashMap得到对应的序号重新填充arr
 */
