package LCP第18题_早餐组合.解法4;

public class Solution {
    /*
       例：
        输入：staple = [2,1,1], drinks = [8,9,5,1], x = 9
        输出：8
     */
    public int breakfastNumber(int[] staple, int[] drinks, int x) {
        int count = 0;// 计数器，统计种数
        int mod = (int) Math.pow(10, 9) + 7;// 变量，答案需要以 1e9 + 7 (1000000007) 为底取模，因为可能数过大，无法表示所以需要取模
        int[] arr = new int[x + 1];// 创建一个长度为x+1，可以让x个数都在对应下标的位置

        // 遍历数组staple
        for (int i = 0; i < staple.length; i++) {
            // 只记录staple数组中小于x的数，因为如果stabple[i]大于等于x，那么就不需要比较了，因为没有意义（都消费超出了）
            if (staple[i] < x) {
                // staple[i]表示当前正在遍历的主食价格
                // arr[staple[i]]++表示staple[i]索引指向的数加1，其实就是统计staple[i]这个数的出现次数在arr数组
                arr[staple[i]]++;// 这句代码非常妙
            }
        }

        // arr[i]为前i个数的总和
        // 为什么要有这段代码呢？因为如果arr[i]+drinks[j]<=x表示arr[i]是符合要求的数，注意，arr数组是有序的，那么它之前的所有次数都应该满足要求，即和小于等于x，所以应该是前面出现符合要求数的总和
        for (int i = 2; i <= x; i++) {
            arr[i] += arr[i - 1];
        }

        // 循环遍历drinks数组
        for (int i = 0; i < drinks.length; i++) {
            // 目标数，即能够使staple[i] + drinks[j]<=x的数
            int target = x - drinks[i];
            if (target <= 0) {
                continue;// 为负数，必然不是需要的数
            }
            count += arr[target];// 计算次数，因为arr[target]为前target个数的总和，即总次数
            count %= mod;// 取模，防止数过大
        }

        return count % mod;
    }
}
/*
    解题思路：
        1.
    注：
        1.思路来源于他人题解：https://leetcode-cn.com/problems/2vYnGI/solution/shi-jian-fu-za-du-omn-by-zzh-28/
 */
/*
    执行用时：9 ms, 在所有 Java 提交中击败了92.83% 的用户
    内存消耗：48.4 MB, 在所有 Java 提交中击败了99.37% 的用户
 */