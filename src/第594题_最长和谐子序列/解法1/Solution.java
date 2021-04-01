package 第594题_最长和谐子序列.解法1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int findLHS(int[] nums) {
        // 1.统计nums数组中每个数的出现次数
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // 2.将符合和谐子序列的两个数的和保存到Set集合中
        Set<Integer> set = new HashSet<>();
        for (Integer key : map.keySet()) {
            // key是和谐子序列中的其中一个数，另外一个数要么是key+1，要么是key-1
            if (map.getOrDefault(key - 1, 0) != 0) {
                int sum = map.get(key) + map.get(key - 1);
                set.add(sum);// 获得和谐子序列中两个数的出现次数，并且求和，然后保存到Set集合
            } else if (map.getOrDefault(key + 1, 0) != 0) {
                int sum = map.get(key) + map.get(key + 1);
                set.add(sum);
            }
        }
        // 3.寻找到保存在和谐子序列中的最长长度，然后返回
        int maxLen = 0;
        for (Integer len : set) {
            if (len > maxLen) {
                maxLen = len;
            }
        }
        return maxLen;
    }
}
/*
    解题思路：
        0.HashMap计数
        1.其实根据题意来讲，和谐子序列中不重复的数只有两个，一个是最大值，一个是最小值
        2.所以我们需要找出nums数组中相差为1的两个数，如1和2、2和3、3和4这样的，同时，需要满足，这两个数的出现次数之和要是最长的
        3.由这样两个出现次数之和最长的数组成的序列就是最长的和谐子序列，如nums=[1,3,2,2,5,2,3,7]的和谐子序列是[3,2,2,2,3]
        4.上面三条是为了理解题意，下面是解决问题的思路，先统计nums数组中每个数的出现次数
        5.找出nums中相差为1的两个数，这里是使用HashMap中的key进行遍历的，而不是遍历nums，是为了去重，遍历key，寻找子序列中另外一个数要么是key-1要么是key+1
        6.然后从HashMap中获取key和key+1或key-1数的出现次数，并且求和，将这些和保存在List集合中
        7.最后找到List集合中的最大值，就是最长的和谐子序列元素个数
 */
/*
    执行用时：24 ms, 在所有 Java 提交中击败了42.11% 的用户
    内存消耗：40.1 MB, 在所有 Java 提交中击败了7.16% 的用户
 */