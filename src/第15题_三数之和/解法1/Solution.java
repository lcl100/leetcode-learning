package 第15题_三数之和.解法1;

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> lists = new HashSet<>();
        if (nums.length < 3) {
            return new ArrayList<>();
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int m = j + 1; m < nums.length; m++) {
                    if (nums[i] + nums[j] + nums[m] == 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[m]);
                        list.sort(new Comparator<Integer>() {
                            @Override
                            public int compare(Integer o1, Integer o2) {
                                return o1 - o2;
                            }
                        });
                        lists.add(list);
                    }
                }
            }
        }
        return new ArrayList<>(lists);
    }
}
/*
    解题思路：
        0.暴力破解，三层for循环
 */
/*
    超出时间限制（315 / 318 个通过测试用例）
 */