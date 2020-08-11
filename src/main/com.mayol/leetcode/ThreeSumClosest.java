package leetcode;

import java.util.Arrays;
import java.util.Currency;

/**
* leetcode--16
 */
public class ThreeSumClosest {
    public static void main(String[] argus){
        int[] nums = {0,0,0,0,0,0};
        int solution = solution(nums, 1);
        System.out.println(solution);
    }

    private static int solution(int[] nums, int target){
        //排序
        Arrays.sort(nums);
        //默认给出前三个值之和
        int sum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right){
                int currentSum = nums[i] + nums[left] + nums[right];
                //当前的差值小于已经找到的差值
                if(Math.abs(target-currentSum) < Math.abs(target - sum)){
                    sum = currentSum;
                }
                if(currentSum > target){//右指针左移找更小的
                    int m =right - 1;
                    while (left < m && nums[m] == nums[right]){
                        --m;
                    }
                    right = m;
                }else if(currentSum < target){//左指针右移找更大的
                    int n = left + 1;
                    while (  n < right && nums[n] == nums[left]){
                        n++;
                    }
                    left = n;
                }else {
                    return sum;
                }
            }
        }
        return sum;
    }
}
