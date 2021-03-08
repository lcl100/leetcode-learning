package 第1331题_数组序号转换.解法3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author 二木成林
 */
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        // 0. 克隆一个arr数组
        int[] cloneArr = arr.clone();
        // 1. 将arr数组去重并排序
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        Integer[] ts = set.toArray(new Integer[set.size()]);
        Arrays.sort(ts);
        // 2. 双层for循环
        for (int i = 0; i < cloneArr.length; i++) {
            for (int j = 0; j < ts.length; j++) {
                // 寻找元素的序号位置
                if (cloneArr[i] == ts[j]) {
                    cloneArr[i] = j + 1;
                    break;
                }
            }
        }
        return cloneArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().arrayRankTransform(new int[]{37, 12, 28, 9, 100, 56, 80, 5, 12})));
    }
}
/*
    解题思路（双重for循环，超出时间限制）：
        0. 克隆一个arr数组
        1. 将arr数组去重并排序
        2. 双重for循环，确定克隆数组中每个数组在排序数组中的位置，然后替换保存
 */
