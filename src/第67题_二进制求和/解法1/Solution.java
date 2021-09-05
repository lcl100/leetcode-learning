package 第67题_二进制求和.解法1;

/**
 * @author lcl100
 * @create 2021-09-04 11:59
 */
class Solution {
    /**
     * <p>思路：Java的API</p>
     * <p>步骤：</p>
     * <ul>
     *     <li>第一步，将两个二进制字符串转换成十进制整数</li>
     *     <li>第二步，然后将两个转换后的整数相加</li>
     *     <li>第三步，将相加的整数结果再转换成二进制字符串返回</li>
     * </ul>
     * <p>结果：失败</p>
     * <p>评价：无效的方法，因为long数据类型所能表示的最大数是有极限的，而二进制字符串是没有极限的，所以会造成无法转换成功的问题。</p>
     *
     * @param a 第一个二进制字符串
     * @param b 第二个二进制字符串
     * @return 两个二进制字符串相加的和
     */
    public String addBinary(String a, String b) {
        // 第一步，将两个二进制字符串转换成十进制整数
        long aLong = Long.valueOf(a, 2);
        long bLong = Long.valueOf(b, 2);

        // 第二步，然后将两个转换后的整数相加
        long result = aLong + bLong;

        // 第三步，将相加的整数结果再转换成二进制字符串返回
        String binary = Long.toBinaryString(result);
        return binary;
    }
}