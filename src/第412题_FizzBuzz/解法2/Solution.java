package 第412题_FizzBuzz.解法2;

import java.util.*;

class Solution {
    public List<String> fizzBuzz(int n) {
        // 存储了条件的Map
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "Fizz");
        map.put(5, "Buzz");
        // 遍历循环
        List<String> list = new ArrayList<>();
        for (int num = 1; num <= n; num++) {
            StringBuilder sb = new StringBuilder();
            Set<Integer> keySet = map.keySet();
            // 判断num是否是3或者5的倍数
            for (Integer key : keySet) {
                if (num % key == 0) {
                    sb.append(map.get(key));
                }
            }
            // 表示num既不是3的倍数也不是5的倍数，直接添加即可
            if (sb.length() == 0) {
                sb.append(num);
            }
            list.add(sb.toString());
        }
        return list;
    }
}
/*
    解题思路：
        1.用HashMap存储条件映射关系
    注：
        1.解题思路来源于官方题解：https://leetcode-cn.com/problems/fizz-buzz/solution/fizz-buzz-by-leetcode/
 */
/*
    执行用时：6 ms, 在所有 Java 提交中击败了35.13% 的用户
    内存消耗：40.1 MB, 在所有 Java 提交中击败了5.13% 的用户
 */