package 第1773题_统计匹配检索规则的物品数量.解法1;

import java.util.List;

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (List<String> item : items) {
            // type:0; color:1; name:2
            if (ruleKey.equals("type") && item.get(0).equals(ruleValue)) {
                count++;
            } else if (ruleKey.equals("color") && item.get(1).equals(ruleValue)) {
                count++;
            } else if (ruleKey.equals("name") && item.get(2).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
/*
    解题思路：
        0.暴力破解
        1.其实本题就是条件判断而已
 */
/*
    执行用时：7 ms, 在所有 Java 提交中击败了25.82% 的用户
    内存消耗：43.3 MB, 在所有 Java 提交中击败了21.24% 的用户
 */