package 第1773题_统计匹配检索规则的物品数量.解法2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        // 把它们的映射关系保存到Map中，直接查询即可
        // Map中的key对应的是ruleKey，而Map中的value对应的是在List<String>中的索引位置
        Map<String, Integer> map = new HashMap<>();
        map.put("type", 0);
        map.put("color", 1);
        map.put("name", 2);
        // 统计次数
        int count = 0;
        for (List<String> item : items) {
            if (item.get(map.get(ruleKey)).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
/*
    解题思路：
        0.HashMap映射
        1.使用HashMap保存映射关系
 */
/*
    执行用时：7 ms, 在所有 Java 提交中击败了25.82% 的用户
    内存消耗：42.8 MB, 在所有 Java 提交中击败了95.53% 的用户
 */