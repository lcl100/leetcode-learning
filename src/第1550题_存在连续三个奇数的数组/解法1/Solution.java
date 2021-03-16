package 第1550题_存在连续三个奇数的数组.解法1;

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i % 2 != 0) {
                count++;
                // 判断count是否表示已经有连续三个奇数，如果有则直接返回true
                if (count == 3) {
                    return true;
                }
            } else {
                // 是偶数，那么久将count置为0，恢复初始
                count = 0;
            }
        }
        return false;
    }
}
/*
    解题思路：
        1.循环遍历数组arr，用一个计数器count记录连续奇数的出现次数，如果count等于3则返回true
 */
