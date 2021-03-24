package 第1528题_重新排列字符串.解法2;

import java.util.Set;
import java.util.TreeMap;

public class Solution {
    public String restoreString(String s, int[] indices) {
        TreeMap<Integer, Character> map = new TreeMap<>();
        for (int i = 0; i < indices.length; i++) {
            map.put(indices[i], s.charAt(i));
        }
        // 将Map中的值保存为字符串并返回
        StringBuilder sb = new StringBuilder();
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            sb.append(map.get(key));
        }
        return sb.toString();
    }
}
/*
    解题思路：
        0.TreeMap特性，按照key的大小顺序排列
 */
/*
    执行用时：8 ms, 在所有 Java 提交中击败了8.24% 的用户
    内存消耗：39 MB, 在所有 Java 提交中击败了10.48% 的用户
 */