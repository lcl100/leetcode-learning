package 第1047题_删除字符串中的所有相邻重复项.解法2;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String removeDuplicates(String S) {
        List<Character> list = new ArrayList<>();
        for (char c : S.toCharArray()) {
            list.add(c);
        }
        int i=0;
        while (i<list.size()){
            if (i>=0&&(i+1)<list.size()&&list.get(i) == list.get(i + 1)) {
                list.remove(i);
                list.remove(i);
                i--;// 将i=0变成了i--
            }else {
                i++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : list) {
            sb.append(c);
        }
        return sb.toString();
    }
}
/*
    解题思路：
        0.解法1的优化
 */
/*
    执行用时：44 ms, 在所有 Java 提交中击败了22.28% 的用户
    内存消耗：39.1 MB, 在所有 Java 提交中击败了54.00% 的用户
 */