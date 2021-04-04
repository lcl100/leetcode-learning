package 第1078题_Bigram分词.解法1;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        // 将字符串按空格分割成字符串数组
        String[] split = text.split(" ");
        // 循环遍历字符串数组，判断相邻字符串是否等于first和second，如果相等，则将第三个字符串添加到List集合
        List<String> list = new ArrayList<>();
        for (int i = 0; i < split.length - 2; i++) {
            if ((i + 2) < split.length && split[i].equals(first) && split[i + 1].equals(second)) {
                list.add(split[i + 2]);
            }
        }
        // 最后将集合转换成字符串数组返回
        return list.toArray(new String[list.size()]);
    }
}
/*
    解题思路：
        1.将字符串按空格分割成字符串数组
        2.循环遍历字符串数组，判断相邻字符串是否等于first和second，如果相等，则将第三个字符串添加到List集合
        3.最后将集合转换成字符串数组返回
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了97.36% 的用户
    内存消耗：36.8 MB, 在所有 Java 提交中击败了34.31% 的用户
 */