package 第1323题_6和9组成的最大数字.解法1;

class Solution {
    public int maximum69Number(int num) {
        String s = String.valueOf(num);
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            // 只反转第一个不为'9'的字符
            if (chars[i] != '9') {
                chars[i] = '9';
                break;
            }
        }
        // 将chars数组中的数字重新组装成数字并返回
        StringBuilder sb = new StringBuilder();
        for (char aChar : chars) {
            sb.append(aChar);
        }
        return Integer.parseInt(sb.toString());
    }
}
/*
    解题思路：
        0.逐位比较转换
        1.将数转换成字符数组，然后从前到后逐位判断是否为9，如果不是则将其改为9
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了72.00% 的用户
    内存消耗：35.2 MB, 在所有 Java 提交中击败了80.78% 的用户
 */