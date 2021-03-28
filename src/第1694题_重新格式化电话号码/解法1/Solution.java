package 第1694题_重新格式化电话号码.解法1;

class Solution {
    public String reformatNumber(String number) {
        // 1.提取只有字母的字符串，去除空格和破折号，下面循环提取，没有使用String的API，提高效率
        char[] chars0 = number.toCharArray();
        StringBuilder sb0 = new StringBuilder();
        for (char aChar : chars0) {
            if (aChar >= '0' && aChar <= '9') {
                sb0.append(aChar);
            }
        }
        number = sb0.toString();
        // 2.将number字符串转换成字符数组，然后分情况处理
        char[] chars = number.toCharArray();
        int len = chars.length;
        StringBuilder sb = new StringBuilder();
        if (len % 3 == 0) {// 第一种情况
            for (int i = 0; i < number.length() / 3; i++) {
                sb.append(chars[i * 3]).append(chars[i * 3 + 1]).append(chars[i * 3 + 2]);
                if (i != number.length() / 3 - 1) {
                    sb.append("-");
                }
            }
        } else if (len % 3 == 1) {// 第二种情况
            for (int i = 0; i < number.length() / 3 - 1; i++) {
                sb.append(chars[i * 3]).append(chars[i * 3 + 1]).append(chars[i * 3 + 2]).append("-");
            }
            sb.append(chars[len - 4]).append(chars[len - 3]).append("-").append(chars[len - 2]).append(chars[len - 1]);
        } else if (len % 3 == 2) {// 第三种情况
            for (int i = 0; i < number.length() / 3; i++) {
                sb.append(chars[i * 3]).append(chars[i * 3 + 1]).append(chars[i * 3 + 2]).append("-");
            }
            sb.append(chars[len - 2]).append(chars[len - 1]);
        }
        return sb.toString();
    }
}
/*
    解题思路：
        0.分情况处理
        1.先提取只有字母的字符在字符串中，去除掉空格和破折号
        2.分三种情况处理：
            第一种情况：chars.length%3==0，即处理后的字符串长度为3的幂，只需要在每三个数字后添加一个破折号即可
                number = "1-23-45 6"        "123-456"
            第二种情况：chars.length%3==1，即处理后的字符串长度为3的幂加1，只需要在最后四个数字中间添加一个破折号，而其他每三个数字后面添加一个破折号
                number = "123 4-567"        "123-45-67"
            第三种情况：chars.length%3==2，即处理后的字符串长度为3的幂加2，只需要将最后两个数字单独处理，而其他每三个数字后面添加一个破折号
                number = "123 4-5678"       "123-456-78"
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了99.73% 的用户
    内存消耗：36.3 MB, 在所有 Java 提交中击败了99.89% 的用户
 */