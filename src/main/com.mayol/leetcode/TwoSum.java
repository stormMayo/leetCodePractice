package leetcode;

import java.util.HashMap;

/**
 * leetCode  第一题
 * @data 创建时间：2019/11/4 9:14
 * @version: V1.0
 * 类说明
 */


public class TwoSum {
    public static void main(String[] argus){
        int[] nums = {0,2,4,15};
        int target = 6;
        int[] ints = SolutionOne.twoSum(nums, target);
    }
}

class SolutionOne{
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; ++i) {
            m.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; ++i) {
            int t = target - nums[i];
            if (m.containsKey(t) && m.get(t) != i) {
                res[0] = i;
                res[1] = m.get(t);
                break;
            }
        }
        return res;
    }
}


class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        throw new IllegalArgumentException("未找打结果");
    }
}
