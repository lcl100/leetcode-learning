package 第258题_各位相加.解法3;

class Solution {
    public int addDigits(int num) {
        // 例如：128=1*100+2*10+8=1*99+2*9+1+2+8，其中1+2+8是下一次迭代的数
        // 因为是十进制，所以这里是9
        // 10^m-1一定是9的倍数，例如m=1那么10^1-1=9是9的倍数；例如m=3那么10^3-1=999是9的倍数
        return (num - 1) % 9 + 1;
    }
}
/*
    解题思路：
    注：
        1.代码和解题思路来源于：https://leetcode-cn.com/problems/add-digits/solution/java-o1jie-fa-de-ge-ren-li-jie-by-liveforexperienc/
        2.此解法甚妙，可以去看题解解释。
        3.推荐看这个带图的解释：https://blog.csdn.net/weixin_41541562/article/details/106635899
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：35.6 MB, 在所有 Java 提交中击败了46.67% 的用户
 */