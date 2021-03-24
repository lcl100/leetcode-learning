package LCP第01题_猜数字.解法2;

public class Solution {
    public int game(int[] guess, int[] answer) {
        int count = 0;
        if (guess[0] == answer[0]) {
            count++;
        }
        if (guess[1] == answer[1]) {
            count++;
        }
        if (guess[2] == answer[2]) {
            count++;
        }
        return count;
    }
}
/*
    解题思路：
        0.利用题目限制
        1.题目限制了只有三个数，用三个判断也可以
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：35.7 MB, 在所有 Java 提交中击败了28.80% 的用户
 */