package leetcode;

import sun.applet.Main;

/**
 718:给两个整数数组 A 和 B ，返回两个数组中公共的、长度最长的子数组的长度。
 示例 1:
 输入:
 A: [1,2,3,2,1]
 B: [3,2,1,4,7]
 输出: 3
 解释:
 长度最长的公共子数组是 [3, 2, 1]。
 */
public class findLength718 {
    public static void main(String[] argus){
        int[] A = {1,2,3,2,1};
        int[] B = {3,2,1,4,7};
        int solution = solution(A, B);
        System.out.println(solution);
    }
    public static int solution(int[] A, int[] B){
        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int len = 0;
                while (i+len < A.length && j+len < B.length && A[i+len] == B[j+len]){
                    len++;
                }
                ans = Math.max(ans, len);

            }
        }
        return  ans;
    }
}
