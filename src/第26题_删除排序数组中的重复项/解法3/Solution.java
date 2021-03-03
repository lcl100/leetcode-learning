package 第26题_删除排序数组中的重复项.解法3;

public class Solution {
    public int removeDuplicates(int[] nums) {
        // 1.循环nums数组的所有元素
        int len=nums.length;
        int i=0;
        while(i<len-1){
            // 2.比较相邻元素是否相等
            if(nums[i]==nums[i+1]){
                // 3.如果相邻元素相等，则是重复元素，则将相等元素的第二个元素之后的所有元素向前移动一个位置并数组减1
                for(int m=i+1;m<len-1;m++){
                    nums[m]=nums[m+1];
                }
                len--;
            }else {
                i++;// 注意，如果不相等，则计数器i加1
            }
        }
        return len;
    }
}
/**
 * 思路：
 * 由于是有序数组，所以比较数组的相邻元素是否是重复元素，如果是则将第二个重复元素后的所有元素向前移动一个位置，并数组长度减1
 */