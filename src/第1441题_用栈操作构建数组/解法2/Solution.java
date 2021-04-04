package 第1441题_用栈操作构建数组.解法2;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int i = 0;// 指向target数组的指针，从0到target.length-1
        int j = 1;// 指向n维护的列表的指针，从1到n
        while (i < target.length && j <= n) {
            if (target[i] == j) {
                list.add("Push");
                i++;
                j++;
            } else {
                list.add("Push");
                list.add("Pop");
                j++;
            }
        }
        return list;
    }
}
/*
    解题思路：
        1.解题思路其实本质上和解法1一致，只是仅需要一次循环
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：38.9 MB, 在所有 Java 提交中击败了6.64% 的用户
 */