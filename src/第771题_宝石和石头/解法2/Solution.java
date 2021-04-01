package 第771题_宝石和石头.解法2;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int[] upper = new int[26];// 统计大写字母的出现次数的数组
        int[] lower = new int[26];// 统计小写字母的出现次数的数组
        // 对stones字符串中每个字符的出现次数进行统计
        char[] chars = stones.toCharArray();
        for (char c : chars) {
            if (c >= 'a' && c <= 'z') {
                lower[c - 'a']++;// 小写字母放到lower数组中
            } else {
                upper[c - 'A']++;// 大写字母放到upper数组中
            }
        }
        // 计算宝石的个数
        int count = 0;
        for (char c : jewels.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                count += lower[c - 'a'];// 如果是小写字母则从lower数组中取值
            } else {
                count += upper[c - 'A'];// 如果是大写字母则从upper数组中取值
            }
        }
        return count;
    }
}
/*
    解题思路：
        0.数组计数
        1.由于大写字母和字母都在ASCII码表中对应着唯一的十进制数，所以可以用数组来进行计数
        2.用两个数组来分别对大写字母和小写字母的出现次数进行计数
        3.最后相加总和返回即可
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了97.75% 的用户
    内存消耗：36.8 MB, 在所有 Java 提交中击败了56.49% 的用户
 */