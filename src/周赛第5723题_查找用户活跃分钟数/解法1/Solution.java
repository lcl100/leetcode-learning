package 周赛第5723题_查找用户活跃分钟数.解法1;

import java.util.*;

class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int[] log : logs) {
            if (!map.containsKey(log[0])) {
                Set<Integer> set=new HashSet<>();
                set.add(log[1]);
                map.put(log[0], set);
            } else {
                Set<Integer> set = map.get(log[0]);
                set.add(log[1]);
                map.put(log[0],set);
            }
        }
        int[] res = new int[k];
        for (Integer key : map.keySet()) {
            res[map.get(key).size() - 1]++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ints = new Solution().findingUsersActiveMinutes(new int[][]{
                {0,5},
                {1,2},
                {0,2},
                {0,5},
                {1,3}
        }, 5);
        System.out.println(Arrays.toString(ints));
    }
}