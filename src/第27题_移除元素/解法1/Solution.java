package 第27题_移除元素.解法1;

class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int i = 0;
        while (i < len) {
            if (nums[i] == val) {
                for (int m = i; m < len - 1; m++) {
                    nums[m] = nums[m + 1];
                }
                len--;
            } else {
                i++;
            }
        }
        return len;
    }
}
/*
    解题思路：
        1.遍历循环数组中所有元素，如果匹配到指定元素，则将该元素后的所有元素向前移动一个位置，并数组长度减1
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：37.2 MB, 在所有 Java 提交中击败了18.24% 的用户
 */