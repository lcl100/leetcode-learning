package 第1331题_数组序号转换.解法1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        // 0. 需要克隆一个arr数组来确定给定的顺序
        int[] cloneArr = arr.clone();
        System.out.println(Arrays.toString(cloneArr));
        // 1. 排序arr数组
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // 2. 将排序后的arr数组中的不重复元素添加到HashMap集合中
        // 2.1 创建一个HashMap
        Map<Integer, Integer> map = new HashMap<>();
        // 2.2 循环遍历arr数组
        int count=0;// 注意，这是一个计数器，记录已经重复的数字的个数，比如1,2,2,3,3那么count就为2，因为2、3分别重复了一次
        for (int i = 0; i < arr.length; i++) {
            // 2.2.1 如果HashMap中已经存在键为arr[i]的键值对，那么不添加到集合中，跳出即可
            if (map.containsKey(arr[i])) {
                count++;
                continue;
                // 2.2.2 如果不存在，则添加
            } else {
                map.put(arr[i], i + 1-count);// 由于存在重复元素，可能影响后面元素的序号，所以需要减去重复元素的存在
            }
        }
        System.out.println(map);
        // 3. 循环遍历克隆数组cloneArr
        for (int i = 0; i < cloneArr.length; i++) {
            arr[i] = map.get(cloneArr[i]);
        }
        // 4. 返回序号数组
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().arrayRankTransform(new int[]{37,12,28,9,100,56,80,5,12})));
    }
}
/*
    解题思路：
        0. 需要克隆一个arr数组来确定给定的顺序，因为排序后数组中元素顺序已经改变
        1. 将给定的arr数组进行排序
        2. 将数组中的每个不重复元素添加到HashMap中，键是数字，值是该数字对应的下标加1，并且如果有重复数字，只保留第一次出现的位置
        3. 然后再循环克隆数组，将数组元素作为键去访问HashMap得到对应的序号重新填充arr
 */