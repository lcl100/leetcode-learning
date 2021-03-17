package 第345题_反转字符串种的元音字母.解法2;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u' ||
                    chars[i] == 'A' || chars[i] == 'E' || chars[i] == 'I' || chars[i] == 'O' || chars[i] == 'U') {
                // 将是元音字母的字符添加到List集合
                list.add(chars[i]);
            }
        }
        // 指针，用于倒序遍历List集合
        int index = list.size() - 1;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u' ||
                    chars[i] == 'A' || chars[i] == 'E' || chars[i] == 'I' || chars[i] == 'O' || chars[i] == 'U') {
                // 用倒序的List集合中的元素替换正序的元素，正好是对称的
                chars[i] = list.get(index);
                index--;
            }
        }
        return String.valueOf(chars);
    }
}
/*
    解题思路：
        0.效率相对于双指针要低些，但是是一个思路
        1.遍历字符串转换的字符数组，然后将里面的元音字母用一个List来存放（注意，存放必须是有序的，即按照传入的顺序）
        2.然后再遍历字符数组，将原来元音字母的位置用List集合倒序替换
 */