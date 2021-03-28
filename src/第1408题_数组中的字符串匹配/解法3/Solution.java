package 第1408题_数组中的字符串匹配.解法3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<String> stringMatching(String[] words) {
        // 按照长度升序排序
        Arrays.sort(words, (o1, o2) -> {
            return o1.length() - o2.length();
        });
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].contains(words[i])) {
                    list.add(words[i]);
                    break;// 跳出循环，防止重复
                }
            }
        }
        return list;
    }
}
/*
    解题思路：
        0.排序
        1.将数组按长度排序后，只比较比当前字符串长度大的字符串，减少比较次数
 */
/*
    执行用时：3 ms, 在所有 Java 提交中击败了93.60% 的用户
    内存消耗：38.7 MB, 在所有 Java 提交中击败了36.70% 的用户
 */