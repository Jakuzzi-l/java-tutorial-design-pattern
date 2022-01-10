package structure.basic1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个整数数组，判断是否存在重复元素。
 * 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 */
public class Duplicate {
    /**
     * 自己做的  没有考虑到add方法的返回值
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> test = new HashSet();
        for (int num : nums) {
            test.add(num);
        }
        return test.size() == nums.length;
    }


    /**
     * 官方题解1
     * 复杂度分析
     * 时间复杂度：O(N)，其中 N 为数组的长度。
     * 空间复杂度：O(N)，其中 N 为数组的长度。
     * @param nums
     * @return
     */
    public boolean containsDuplicateOfficial1(int[] nums) {
        Set<Integer> test = new HashSet();
        for (int num : nums) {
            if (!test.add(num)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 官方题解2
     * 复杂度分析
     * 时间复杂度：O(NlogN)，其中 N 为数组的长度。需要对数组进行排序。
     * 空间复杂度：O(logN)，其中 N 为数组的长度。注意我们在这里应当考虑递归调用栈的深度。
     * @param nums
     * @return
     */
    public boolean containsDuplicateOfficial2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

}
