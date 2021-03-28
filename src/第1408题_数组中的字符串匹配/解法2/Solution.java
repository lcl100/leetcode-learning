package 第1408题_数组中的字符串匹配.解法2;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        // 将字符数组通过","拼接成一个字符串
        String all = String.join(",", words);
        for (String s : words) {
            // 它们正序索引和倒序索引不一样
            if (all.indexOf(s) != all.lastIndexOf(s)) {
                list.add(s);
            }
        }

        return list;
    }
}
/*
    解题思路：
        0.String的API
 */
/*
    执行用时：2 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：38.7 MB, 在所有 Java 提交中击败了31.53% 的用户
 */