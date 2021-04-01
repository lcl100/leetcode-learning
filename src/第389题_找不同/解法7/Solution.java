package 第389题_找不同.解法7;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public char findTheDifference(String s, String t) {
        // 合并字符串
        String str = s.concat(t);
        Set<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!set.add(c)) {
                set.remove(c);
            } else {
                set.add(c);
            }
        }
        // 返回集合中唯一一个字符
        return set.iterator().next();
    }
}
/*
    解题思路：
        0.Set集合
        1.由于Set集合中只能保存唯一值，所以将两个字符串合并
        2.然后向Set集合中添加字符，如果集合中已经存在该字符，那么删除该集合中的这个字符，如果不存在，则添加入集合
        3.最后集合中会留下一个唯一字符，就是我们需要的
 */
/*
    执行用时：10 ms, 在所有 Java 提交中击败了15.35% 的用户
    内存消耗：38.7 MB, 在所有 Java 提交中击败了5.05% 的用户
 */