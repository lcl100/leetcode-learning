package 第917题_仅仅反转字符串.解法1;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String reverseOnlyLetters(String S) {
        // 1.将所有的大写字母和小写字母都装进数组中
        char[] chars = S.toCharArray();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            // 筛选字母
            if ((chars[i] >= 'a' && chars[i] <= 'z') || (chars[i] >= 'A' && chars[i] <= 'Z')) {
                // 装进集合，再由集合转换成数组
                list.add(chars[i]);
                // 特别注意，将原字母字符替换为空字符，表明这里曾经是一个字母
                chars[i] = ' ';
            }
        }
        Character[] characters = list.toArray(new Character[0]);
        // 2.反转这个只有字母的数组
        reverse(characters, 0, characters.length);
        // 3.再将反转后的数组中的字符放进原来的位置
        int j = 0;
        for (int i = 0; i < chars.length; i++) {
            // 顺序放入，由空格字符标记的位置
            if (chars[i] == ' ') {
                chars[i] = characters[j];
                j++;
            }
        }
        // 4.再将原字符数组chars转换成字符串返回
        return String.valueOf(chars);
    }

    // 交换chars数组中指定start索引和end索引之间的元素
    private void reverse(Character[] chars, int start, int end) {
        for (int i = 0; i < (end - start) / 2; i++) {
            char temp = chars[start + i];
            chars[start + i] = chars[end - 1 - i];
            chars[end - 1 - i] = temp;
        }
    }
}
/*
    解题思路：
        1.将所有的字符装进数组中，然后反转整个数组
        2.再将反转后的数组中每个元素放回原位置
 */
/*
    执行用时：6 ms, 在所有 Java 提交中击败了5.07% 的用户
    内存消耗：36.9 MB, 在所有 Java 提交中击败了16.68% 的用户
 */