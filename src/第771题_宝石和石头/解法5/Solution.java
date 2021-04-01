package 第771题_宝石和石头.解法5;

public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (char c : stones.toCharArray()) {
            if (jewels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}
/*
    解题思路：
        1.从stones字符串遍历字符，查询是否在jewels字符串中存在，如果存在则计数器加1
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了97.75% 的用户
    内存消耗：36.7 MB, 在所有 Java 提交中击败了75.55% 的用户
 */