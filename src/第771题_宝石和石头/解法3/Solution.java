package 第771题_宝石和石头.解法3;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (char cj : jewels.toCharArray()) {
            for (char cs : stones.toCharArray()) {
                if (cj == cs) {
                    count++;
                }
            }
        }
        return count;
    }
}
/*
    解题思路：
        0.暴力破解，双层for循环
        1.使用双层for循环统计jewels字符串中字符在stones字符串中的出现次数，因为jewels中字符是不重复的
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了97.75% 的用户
    内存消耗：36.9 MB, 在所有 Java 提交中击败了45.28% 的用户
 */