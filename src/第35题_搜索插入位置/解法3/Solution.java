package 第35题_搜索插入位置.解法3;

class Solution {
    public int searchInsert(int[] nums, int target) {
        // 1.当target比数组所有元素都小时，直接返回0
        if(target<nums[0]){
            return 0;
        }
        // 2.当target比数组所有元素都大时，直接返回数组长度
        if(target>nums[nums.length-1]){
            return nums.length;
        }
        // 3.返回数组中第一个大于等于target元素的索引
        int flag = -1;// 表示要返回的索引，-1表示返回失败了
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                flag = i;
                break;// 必须跳出
            }
        }
        return flag;
    }
}
/**
 * 思路：解法1的优化
 * 对于大于数组所有元素或小于数组所有元素的target，直接跟最后一个元素或第一个元素比较，返回对应值，不再进行遍历。
 * 进行for循环返回数组中第一个大于等于target元素的值的索引，时间复杂度为n。
 */