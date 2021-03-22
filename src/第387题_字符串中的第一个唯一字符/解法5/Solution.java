package 第387题_字符串中的第一个唯一字符.解法5;

public class Solution {
    public int firstUniqChar(String s) {
        int[] nums = new int[26];
        int i = 0;
        while (i < s.length()) {
            nums[s.charAt(i) - 97]++;// 为什么用97，因为'a'字符的ASCII码值就是97，那么'a'字符的初始索引就是0，存放在nums[0]的位置，'b'字符存放在nums[1]的位置
            i++;
        }
        i = 0;
        while (i < s.length()) {
            if (nums[s.charAt(i) - 97] == 1) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
/*
    解题思路：
        0.一个萝卜一个坑
        1.提示：你可以假定该字符串只包含小写字母。
        2.设定一个长度为26的数组，那么每个字符在ASCII码表中都对应一个数字，那么都能够落在一个指定的位置，其实本质也是统计字符的出现次数
        3.最后查找长度为1的字符
 */
/*
    执行用时：7 ms, 在所有 Java 提交中击败了77.91% 的用户
    内存消耗：39 MB, 在所有 Java 提交中击败了67.04% 的用户
 */