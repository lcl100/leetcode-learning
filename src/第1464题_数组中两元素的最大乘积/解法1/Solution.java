package 第1464题_数组中两元素的最大乘积.解法1;

public class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];// 表示最大值
        int secondMax=-1;// 表示次大值，这里设为-1，因为nums[i]数是有范围的
        int maxIndex=0;// 表示最大值的下标

        // 1.获得最大值及其索引
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max){
                max=nums[i];
                maxIndex=i;
            }
        }

        // 2.获得次大值
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==max&&i!=maxIndex){// 可能存在两个最大值，所以允许次大值等于最大值
                secondMax=nums[i];
                break;
            }else if(nums[i]>secondMax&&nums[i]<max){
                secondMax=nums[i];
            }
        }

        // 3.返回两数减1的乘积
        return (max-1)*(secondMax-1);
    }
}
/**
 * 思路：
 * 不需要考虑下标，只需要找出最大值和次大值，它们的乘积即为所求
 */
