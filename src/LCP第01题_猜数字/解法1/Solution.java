package LCP第01题_猜数字.解法1;

class Solution {
    public int game(int[] guess, int[] answer) {
        // 计数器，记录猜对的次数
        int count = 0;
        for (int i = 0; i < guess.length; i++) {
            if (guess[i] == answer[i]) {
                count++;// 循环比较
            }
        }
        return count;
    }
}
/*
    解题思路：
        0.暴力破解
        1.直接循环比较
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：35.6 MB, 在所有 Java 提交中击败了71.94% 的用户
 */
