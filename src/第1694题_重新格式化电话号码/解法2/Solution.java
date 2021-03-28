package 第1694题_重新格式化电话号码.解法2;

import java.util.ArrayDeque;


class Solution {
    public String reformatNumber(String number) {
        // 1.提取只有字母的字符串
        /*------------------注意：也可以用下面正则表达式代码代替，但会降低效率-------------------*/
        /*number = number.replaceAll("\\s+|-+", "");*/
        char[] chars = number.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char aChar : chars) {
            if (aChar >= '0' && aChar <= '9') {
                sb.append(aChar);
            }
        }
        number = sb.toString();
        // 2.使用队列添加字符，然后用判断分情况添加破折号
        ArrayDeque<Character> queue = new ArrayDeque<>();
        char[] numberChars = number.toCharArray();
        for (int i = 0; i < numberChars.length; i++) {
            // 使用队列添加字符
            queue.add(numberChars[i]);
            // 分情况添加破折号字符
            if ((numberChars.length % 3 == 0 || numberChars.length % 3 == 2) && (i + 1) % 3 == 0 && (i + 1) != numberChars.length) {
                queue.add('-');
            }
            if (numberChars.length % 3 == 1 && (i == numberChars.length - 5 || i == numberChars.length - 3 || (i <= numberChars.length - 5 && ((i + 1) % 3 == 0)))) {
                queue.add('-');
            }
        }
        // 3.将队列中的字符又转换成字符串并返回
        StringBuilder result = new StringBuilder();
        while (!queue.isEmpty()) {
            result.append(queue.pop());
        }
        return result.toString();
    }
}
/*
    解题思路：
        0.队列
        1.提取只有字母的字符串
        2.使用队列装字符，并且分情况添加破折号
        3.最后将队列中的字符重新装到字符串中返回
 */
/*
    执行用时：3 ms, 在所有 Java 提交中击败了38.97% 的用户
    内存消耗：38.4 MB, 在所有 Java 提交中击败了19.48% 的用户
 */