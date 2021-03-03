package 第448题_找到所有数组中消失的数字.解法5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // 1. 将nums数组中每个元素的索引位置的元素加上nums.length
        int len=nums.length;
        for (int num : nums) {
            int x=(num-1)%len;// 因为如果有重复元素，那么就必须对len取模才能得到真实的索引位置，否则超出数组范围
            nums[x]+=len;
        }

        // 2. 将nums数组中小于nums.length的元素挑选出来，添加到List集合中
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<=len){
                list.add(i+1);
            }
        }

        // 3. 返回集合
        return list;
    }

    public static void main(String[] args) {
        List<Integer> disappearedNumbers = new Solution().findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
        System.out.println(disappearedNumbers);
    }
}
/*
    解题思路：
        参考自官方题解https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array/solution/zhao-dao-suo-you-shu-zu-zhong-xiao-shi-d-mabl/
 */
