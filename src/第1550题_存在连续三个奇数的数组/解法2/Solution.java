package 第1550题_存在连续三个奇数的数组.解法2;

public class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for (int i = 0; i <= arr.length - 3; ++i) {
            // 比较相邻的三个数是否是奇数，使用位运算效率更高
            if ((arr[i] & 1) != 0 && (arr[i + 1] & 1) != 0 && (arr[i + 2] & 1) != 0) {
                return true;
            }
        }
        return false;
    }
}
/*
    解题思路：
        比较相邻的三个数是否是奇数
        参考官方题解：https://leetcode-cn.com/problems/three-consecutive-odds/solution/cun-zai-lian-xu-san-ge-qi-shu-de-shu-zu-by-leetcod/
 */