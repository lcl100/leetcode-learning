package 第1688题_比赛中的配对次数.解法1;

class Solution {
    public int numberOfMatches(int n) {
        int count = 0;
        while (n > 1) {
            count += n % 2 == 0 ? n / 2 : n / 2 + 1;
            n /= 2;
        }
        return count;
    }
}
/*
    解题思路：
        1.如果count是奇数则比赛场数是count/2+1，如果是偶数则比赛场数为count/2
        2.统计一轮次数后，对n除以2，继续下一轮，直到n为1为止
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：35 MB, 在所有 Java 提交中击败了92.25% 的用户
 */