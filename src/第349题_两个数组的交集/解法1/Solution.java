package 第349题_两个数组的交集.解法1;

import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // 1.对nums1和nums2数组去重
        Set<Integer> nums1Set = new HashSet<>();
        for (int i : nums1) {
            nums1Set.add(i);
        }
        Set<Integer> nums2Set = new HashSet<>();
        for (int i : nums2) {
            nums2Set.add(i);
        }
        // 2.将元素添加到Map中，并记录出现次数
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums1Set) {
            if (map.containsKey(num)) {
                Integer value = map.get(num);
                value++;
                map.put(num, value);
            } else {
                map.put(num, 1);
            }
        }
        for (int num : nums2Set) {
            if (map.containsKey(num)) {
                Integer value = map.get(num);
                value++;
                map.put(num, value);
            } else {
                map.put(num, 1);
            }
        }
        // 3.判断出现次数大于1的数，添加到List集合中
        List<Integer> list = new ArrayList<>();
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            if (map.get(key) > 1) {
                list.add(key);
            }
        }
        // 4.将List集合转换成int[]数组
        int[] n = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            n[i] = list.get(i);
        }
        return n;
    }

    public static void main(String[] args) {
        int[] ints = new Solution().intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2});
        System.out.println(Arrays.toString(ints));
    }
}
/*
    解题思路：
        0.关键是必须对两个数组去重，否则计算个数会失误
        1.分别单独遍历两个数组，然后记录每个数的出现次数，用HashMap存放
        2.然后统计出现次数大于1的次数，就是我们需要的
 */