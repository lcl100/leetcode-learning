package 第367题_有效的完全平方数.解法4;

public class Solution {
    public boolean isPerfectSquare(int num) {
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;
    }
}
/*
    解题思路：
        0.数学规律
            1   ——  1
            4   ——  1+3
            9   ——  1+3+5
            16  ——  1+3+5+7
            25  ——  1+3+5+7+9
            ... ——  ...
            1+3+5+7+...(2*N−1)=N^2
        1.所以判断一个数减去1、3、5...后是否为0，如果为0表示是完全平方数，否则不是
    注：
        1.代码独立完成，思路来源于别人的题解：https://leetcode-cn.com/problems/valid-perfect-square/solution/zhi-xing-yong-shi-0-ms-zai-suo-you-c-ti-jiao-zh-44/
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了18.95% 的用户
    内存消耗：35.2 MB, 在所有 Java 提交中击败了63.64% 的用户
 */