package 第1523题_在区间范围内统计奇数数目.解法3;

class Solution {
    public int countOdds(int low, int high) {
        // 分为下面四种情况
        if (low % 2 == 0 && high % 2 == 0) {
            return (high - low) / 2;
        } else {
            return (high - low) / 2 + 1;
        }
    }
}
/*
    解题思路：
        0.数学
        1.其实low和high共分为四种情况：
            第一种情况：low为偶数，high为偶数    ——  [6,7,8,9,10]    ——  奇数个数为2，即(high-low)/2=(10-6)/2=2
            第二种情况：low为偶数，high为奇数    ——  [6,7,8,9,10,11] ——  奇数的个数为3，即(high-low)/2+1=(11-6)/2+1=2+1=3
            第三种情况：low为奇数，high为偶数    ——  [7,8,9,10]      ——  奇数的个数为2，即(high-low)/2+1=(10-7)/2+1=2
            第四种情况：low为奇数，high为奇数    ——  [7,8,9,10,11]   ——  奇数的个数为3，即(high-low)/2+1=(11-7)/2+1=3
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：35.4 MB, 在所有 Java 提交中击败了8.69% 的用户
 */