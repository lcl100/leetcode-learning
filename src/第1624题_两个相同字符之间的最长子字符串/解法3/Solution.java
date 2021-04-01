package 第1624题_两个相同字符之间的最长子字符串.解法3;

class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        // 创建一个二元数组
        int[][] letterCount = new int[26][3];
        // 对字符串s中每个小写字母的出现次数、起始索引、结束索引进行记录
        char[] chars = s.toCharArray();
        for (int index = 0; index < chars.length; index++) {
            int i = chars[index] - 'a';
            if (letterCount[i][0] != 0) {
                // 表示该字母出现过至少一次，进行更新
                letterCount[i][0]++;// 记录出现次数
                letterCount[i][2] = index;// 记录结束索引
            } else {
                // 表示第一次记录
                letterCount[i][0] = 1;
                letterCount[i][1] = index;// 记录起始索引
            }
        }
        // 找出最大值
        int max = -1;
        for (int[] letter : letterCount) {
            if (letter[0] >= 2) {
                max = Math.max(letter[2] - letter[1] - 1, max);
            }
        }
        return max;
    }
}
/*
    解题思路：
        0.数组计数
        1.题目中有提示说明字符串s中只包含小写英文字母，所以可以考虑用一个长度26的数组来记录每个小写英文字母的出现次数
        2.但需要计算子字符串的长度，所以用一个int[26][3]二元数组来记录信息，其中val[i][0]表示该字母的出现次数，val[i][1]表示该字母的起始索引，val[i][2]表示该字母的结束索引
        3.最后遍历二元数组返回max(letter[2] - letter[1] - 1)最大值即可
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了78.60% 的用户
    内存消耗：36.2 MB, 在所有 Java 提交中击败了77.36% 的用户
 */