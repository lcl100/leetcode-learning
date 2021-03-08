package 第1394题_找出数组中的幸运数.解法1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int findLucky(int[] arr) {
        // 1. 将arr数组中的每个元素和出现次数存在在HashMap中
        Map<Integer,Integer> map=new HashMap<>();
        for (Integer key : arr) {
            // 1.1 如果HashMap中已经存在某个key，则次数加1
            if(map.containsKey(key)){
                int i = map.get(key);
                i+=1;
                map.put(key,i);
            // 1.2 如果不存在，则填充到HashMap中，次数设为1
            }else {
                map.put(key,1);
            }
        }

        // 2.循环遍历HashMap集合，比较key和value是否相等，并且返回相等的最大值
        Set<Integer> keySet = map.keySet();
        int findVal=-1;
        for (int key : keySet) {
            if(key==map.get(key)){
                // 计算最大值
                if(key>findVal){
                    findVal=key;
                }
            }
        }

        // 3. 返回最终的结果
        return findVal;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().findLucky(new int[]{2, 2, 3, 4}));
    }
}
/*
    解题思路：
        1.使用HashMap来存放每个数的出现次数，如果HashMap中的键和值相等并且是整个集合中的最大值，那么则就是幸运数字
 */
