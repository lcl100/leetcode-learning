package 第1047题_删除字符串中的所有相邻重复项.解法1;

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
            if ((i+1)<list.size()&&list.get(i) == list.get(i + 1)) {
                list.remove(i);
                list.remove(i);
                i=0;
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
    执行用时：263 ms, 在所有 Java 提交中击败了6.24% 的用户
    内存消耗：38.9 MB, 在所有 Java 提交中击败了75.08% 的用户
 */
