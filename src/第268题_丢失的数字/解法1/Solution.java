package 第268题_丢失的数字.解法1;

public class Solution {
    public int missingNumber(int[] nums) {
        for (int i = 0; i <= nums.length; i++) {// 循环遍历[0~n]
            boolean flag = false;// 标记，用来标记当前数是否缺失，false表示缺失
            for (int num : nums) {// 循环遍历nums数组
                if (num == i) {// 判断值是否有相等的情况
                    flag = true;// 如果相等，则将该数i的标记置为true，表示未缺失
                    break;// 然后直接跳出当前for循环，后面不再比较，
                }
            }
            if (!flag) {// 对每个数的flag标记进行验证，如果为false，则表示缺失，则返回数
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{3, 0, 1};
        System.out.println();
        System.out.println(solution.missingNumber(nums));
    }
}
/**
 * 思路：
 * 双层for循环遍历
 */
