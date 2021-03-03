package 第977题_有序数组的平方.解法3;

class Solution {
    public int[] sortedSquares(int[] A) {
        int n = A.length;
        int[] ans = new int[n];
        for (int i = 0, j = n - 1, pos = n - 1; i <= j; ) {
            if (A[i] * A[i] > A[j] * A[j]) {
                ans[pos] = A[i] * A[i];
                ++i;
            } else {
                ans[pos] = A[j] * A[j];
                --j;
            }
            --pos;
        }
        return ans;
    }
}
/**
 * 思路：双指针【https://leetcode-cn.com/problems/squares-of-a-sorted-array/solution/you-xu-shu-zu-de-ping-fang-by-leetcode-solution/】
 * 使用两个指针分别指向位置 000 和 n−1n-1n−1，每次比较两个指针对应的数，选择较大的那个逆序放入答案并移动指针。
 */