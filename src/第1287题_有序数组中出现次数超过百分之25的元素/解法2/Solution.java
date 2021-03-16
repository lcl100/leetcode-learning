package 第1287题_有序数组中出现次数超过百分之25的元素.解法2;

public class Solution {
    public int findSpecialInteger(int[] arr) {
        int limit=(int)arr.length/4;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==arr[i+limit]){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().findSpecialInteger(new int[]{1, 2, 2, 6, 6, 6, 6, 7, 10}));
    }
}
/*
    解题思路：
        1.数组中一定会存在某个元素大于数组长度25%
        2.将每个元素的索引加上数组长度的25%，检查是否相等，如果相等表示该数的个数一定大于数组长度的25%，然后则返回，不相等则继续下一次循环
 */
