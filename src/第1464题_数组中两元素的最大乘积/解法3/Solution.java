package 第1464题_数组中两元素的最大乘积.解法3;

public class Solution {
    public int maxProduct(int[] nums) {
        int max=(nums[0]-1)*(nums[1]-1);
        for (int i = 0; i < nums.length; i++) {
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]-1)*(nums[j]-1)>max){
                    max=(nums[i]-1)*(nums[j]-1);
                }
            }
        }
        return max;
    }
}
/**
 * 思路：暴力破解
 * 使用双层遍历循环，求得最大乘积
 */
