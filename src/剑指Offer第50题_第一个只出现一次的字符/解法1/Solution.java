package 剑指Offer第50题_第一个只出现一次的字符.解法1;

import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    public char firstUniqChar(String s) {
        // 将字符串转换成字符数组，并用Set进行去重
        char[] chars = s.toCharArray();
        Set<Character> set = new LinkedHashSet<>();// 注意，不能使用HashSet，因为必须保证输入顺序
        for (char aChar : chars) {
            set.add(aChar);
        }
        Character[] characters = set.toArray(new Character[set.size()]);
        // 进行双层for循环，统计每个字符的出现次数，如果某个字符的出现次数为1，则返回
        for (Character character : characters) {
            int count = 0;// 计数器，记录每个数的出现次数
            for (char aChar : chars) {
                if (character == aChar) {
                    count++;
                }
            }
            // 判断是否是第一个只出现一次的字符
            if (count == 1) {
                return character;
            }
        }
        return ' ';// 如果输入的是空字符串，则返回' '
    }
}
/*
    解题思路：
        0.暴力破解
        1.将字符串转换成数组进行处理，并使用Set去重，因为只需要统计一回每个字符的出现次数，重复的字符没必要再重复统计了
        2.然后双层for循环进行遍历，统计每个数的出现次数，判断是否为1
 */
/*
    执行用时：39 ms, 在所有 Java 提交中击败了13.30% 的用户
    内存消耗：38.5 MB, 在所有 Java 提交中击败了93.33% 的用户
 */