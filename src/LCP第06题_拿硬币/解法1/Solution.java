package LCP第06题_拿硬币.解法1;

class Solution {
    public int minCount(int[] coins) {
        int count = 0;// 计数器，记录总出现次数
        for (int coin : coins) {
            if (coin % 2 == 0) {
                count += coin / 2;
            } else {
                count += coin / 2 + 1;
            }
        }
        return count;
    }
}
/*
    解题思路：
        0.循环计数
        1.判断循环遍历的数是奇数还是偶数，然后计算次数
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：35.6 MB, 在所有 Java 提交中击败了83.42% 的用户
 */