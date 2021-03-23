package 第961题_重复N次的元素.解法4;

public class Solution {
    public int repeatedNTimes(int[] A) {
        for (int i = 0; i < A.length; i++) {
            int count = 0;// 计数器，记录每个数的出现次数
            for (int j = 0; j < A.length; j++) {
                if (A[i] == A[j]) {
                    count++;
                }
            }
            // 判断该数是否重复A.length/2次
            if (count == A.length / 2) {
                return A[i];
            }
        }
        return -1;
    }
}
/*
    解题思路：
        0.双层for循环，暴力破解，计数
        1.本质上也是计数
 */
/*
    执行用时：3 ms, 在所有 Java 提交中击败了45.37% 的用户
    内存消耗：39.8 MB, 在所有 Java 提交中击败了7.59% 的用户
 */