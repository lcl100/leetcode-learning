package 第1470题_重新排列数组.解法1;

public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] newNums=new int[nums.length];
        int j=0;// 指针，控制在nums数组中的行动
        int i=0;// 指针，控制在newNums数组中的行动
        while (i<newNums.length){
            newNums[i]=nums[j];
            newNums[i+1]=nums[n+j];
            i+=2;
            j++;
        }
        return newNums;
    }
}
/*
    解题思路：
        1.创建一个同nums数组同样大小的新数组newNums
        2.然后按照一定规律将nums数组中的元素装到newNums数组中
 */