package 第217题_存在重复元素.解法4;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>(nums.length);
        for (int num : nums) {
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
/**
 * 思路：
 * 利用哈希表来快速查找。其实解法3用的HashMap也可以利用contains()方法直接判断，而不是去计算每个数的出现次数
 */