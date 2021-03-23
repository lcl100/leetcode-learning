package 第1523题_在区间范围内统计奇数数目.解法1;

class Solution {
    public int countOdds(int low, int high) {
        int oddCount = 0;
        for (int i = low; i <= high; i++) {
            if (i % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount;
    }
}
/*
    解题思路：
        0.循环计数
        1.循环判断每个数是否是计数
    注意事项：
        1.超时了，所以无法判断
 */