package 第27题_移除元素.解法1;

class Solution {
    public int removeElement(int[] nums, int val) {
        int len=nums.length;
        int i=0;
        while (i<len){
            if(nums[i]==val){
                for(int m=i;m<len-1;m++){
                    nums[m]=nums[m+1];
                }
                len--;
            }else {
                i++;
            }
        }
        return len;
    }
}
/**
 * 思路：
 * 遍历循环数组中所有元素，如果匹配到指定元素，则将该元素后的所有元素向前移动一个位置，并数组长度减1
 */