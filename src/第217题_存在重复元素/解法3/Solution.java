package 第217题_存在重复元素.解法3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int num : nums) {
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else {
                map.put(num,1);
            }
        }
        Iterator<Integer> iterator = map.values().iterator();
        while (iterator.hasNext()) {
            if(iterator.next()>1){
                return true;
            }
        }
        return false;
    }
}
/**
 * 思路：
 * 把数组元素放到Map集合中，其中key表示该数，value表示该数的个数，如果value大于2表示存在重复元素
 * 比解法2中的暴力破解还更耗时，不过提供一种思路。
 */
