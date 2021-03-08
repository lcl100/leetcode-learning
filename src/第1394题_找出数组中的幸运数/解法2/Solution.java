package 第1394题_找出数组中的幸运数.解法2;

public class Solution {
    public int findLucky(int[] arr) {
        // 1. 创建一个指定大小的数组，因为该题限制了arr数组中数据的范围（1 <= arr[i] <= 500）
        int[] newArr = new int[501];
        // 2. 数组中每个元素都可以放到对应下标位置
        for (int i : arr) {
            newArr[i]++;// 添加该数出现的次数
        }
        // 3. 比较新数组中每个元素是否相同，倒序遍历，因为大的数在后面，直接返回最大值
        for (int i = newArr.length - 1; i > 0; i--) {// i不能为0，注意
            if (newArr[i] == i) {
                return i;
            }
        }
        // 4. 如果没有幸运数字，则返回-1
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().findLucky(new int[]{2, 2, 2, 3, 3}));
    }
}
/*
    解题思路：
        1. 创建一个指定大小的数组，因为该题限制了arr数组中数据的范围（1 <= arr[i] <= 500）
        2. 数组中每个元素都可以放到对应下标位置，比如说2就存在在newArr[2]位置
        3. 比较新数组中每个元素是否相同，倒序遍历，因为大的数在后面，直接返回最大值
 */
