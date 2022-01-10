package structure.basic1;

public class MaxSubArray {

    /**
     * 动态规划算法
     * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
     * <p>
     * 子数组 是数组中的一个连续部分。
     * nums = [-2,1,-3,4,-1,2,1,-5,4]
     *
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }

    public static int maxSubArray2(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for (int x : nums) {
            sum = Math.max(sum + x,x);
            max = Math.max(max, sum);
        }
        return max;
    }


    public static void main(String[] args) {
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {-1,-2};
        System.out.println(MaxSubArray.maxSubArray(nums2));
        System.out.println(MaxSubArray.maxSubArray2(nums2));

    }
}
