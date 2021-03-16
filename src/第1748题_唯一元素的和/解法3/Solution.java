package 第1748题_唯一元素的和.解法3;

class Solution {
    public int sumOfUnique(int[] nums) {
        // 1. 创建newNums数组，数组长度为101
        int[] newNums = new int[101];
        // 2. 循环遍历nums数组中的元素，为其寻找在newNums中的位置
        for (int i = 0; i < nums.length; i++) {
            // 判断该位置是否已经存在数
            if (newNums[nums[i]] != 0) {
                // 如果已经存在则置为-1，表示标记
                newNums[nums[i]] = -1;
            } else {
                // 不存在，则添加该数
                newNums[nums[i]] = nums[i];
            }
        }
        // 3. 对newNums数组中所有非-1元素求和
        int sum = 0;
        for (int newNum : newNums) {
            if (newNum != -1) {
                sum += newNum;
            }
        }
        return sum;
    }
}
/*
    解题思路：
        1.由于nums[i]的范围在[1,100]之间，所以每个数在newNums[101]这个数组种都有对应位置
        2.这个对应位置指的是以nums[i]作为下标，存放在newNums数组中
        3.如果在该位置中已经存在该数（即重复数），那么将该位置的值置为-1，表示该数是一个重复数，求和的时候不计算
        4.最后求newNums数组的和
 */