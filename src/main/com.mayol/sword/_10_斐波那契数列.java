package sword;
/**
 *https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/
 *
 */

public class _10_斐波那契数列 {
    public int fib(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        int a = 0;
        int b = 1;
        for(int i = 1 ; i < n ;i++){
            b = a + b;
            a = b - a;
            if(b > 1000000007){
                b -= 1000000007;
            }
        }
        return b;
    }
}
