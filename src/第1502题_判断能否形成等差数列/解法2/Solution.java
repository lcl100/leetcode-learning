package 第1502题_判断能否形成等差数列.解法2;

import java.util.Arrays;

public class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int A1=arr[0];
        int d=arr[1]-arr[0];
        for (int i = 2; i < arr.length; i++) {
            // 计算第n项的值
            int Ai=A1+(i+1-1)*d;// 注意：这里这么写是为了配合公式理解，数组从0开始的，而数列项是从1开始的
            if(Ai!=arr[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().canMakeArithmeticProgression(new int[]{3,5,1}));
    }
}
/*
    解题思路：
        1.等差数列有一个通项公式：An=A1+(n-1)*d。
            An是等差数列第n项的结果；A1是等差数列第一项的值；n是第几项；d是公差，即等差数列相邻两项的差值。
        2.根据公式，计算第n项的值是否等于数组给定的值
 */