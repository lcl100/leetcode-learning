package 第268题_丢失的数字.解法3;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int missingNumber(int[] nums) {
        // 1.将nums数组中所有元素装入Map集合
        Map<Integer,Integer> map=new HashMap<>();
        for (int num : nums) {
            map.put(num,num);
        }

        // 2.判断是否存在元素
        for (int i = 0; i <= nums.length; i++) {
            if(!map.containsKey(i)){
                return i;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{0};
        System.out.println();
        System.out.println(solution.missingNumber(nums));
    }
}
/**
 * 思路：
 * 使用Map
 */
