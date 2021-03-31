package 第657题_机器人能否返回原点.解法3;

public class Solution {
    public boolean judgeCircle(String moves) {
        // count[20]='U';count[3]='D';count[11]='L';count[17]='R'
        int[] count = new int[26];
        char[] chars = moves.toCharArray();
        for (char aChar : chars) {
            // 'A'的ASCII码值为65
            count[aChar - 65]++;
        }
        return count[20] == count[3] && count[11] == count[17];
    }
}
/*
    解题思路：
        0.数组计数
        1.解法2的优化，所以思路请看解法2
 */
/*
    执行用时：2 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：38.3 MB, 在所有 Java 提交中击败了91.85% 的用户
 */