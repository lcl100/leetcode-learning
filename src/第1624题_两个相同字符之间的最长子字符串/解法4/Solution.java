package 第1624题_两个相同字符之间的最长子字符串.解法4;

import java.util.Arrays;

class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max = -1;
        // 创建一个一元数组，数组中只保存每个小写字母的索引
        int[] letterCount = new int[26];
        Arrays.fill(letterCount, -1);// 由于字符串的第一个字符索引为0，所以必须把数组中所有数初始置为-1，用来作为判断该字母是否已经被记录过的依据
        // 将字符串转换成字符数组
        char[] chars = s.toCharArray();
        // 循环遍历字符串中的每个字符
        for (int index = 0; index < chars.length; index++) {
            // 求得该小写字母应该存放在数组中的下标位置
            int i = chars[index] - 'a';
            // 判断该处是否已经被记录过索引，-1表示没有，如果不为-1表示已经存在过了
            if (letterCount[i] != -1) {
                // 如果该处已经记录了索引，那么就计算max(index - letterCount[i] - 1, max)
                max = Math.max(index - letterCount[i] - 1, max);
            } else {
                // 如果没有记录索引，表示该字母是第一次出现，记录索引
                letterCount[i] = index;
            }
        }
        // 找出最大值
        return max;
    }
}
/*
    解题思路：
        0.解法3的优化
        1.只需要一次for循环即可
        2.只需要创建一个长度为26的一元数组，数组中记录每个对应小写字母的出现索引
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了78.60% 的用户
    内存消耗：36.3 MB, 在所有 Java 提交中击败了66.20% 的用户
 */