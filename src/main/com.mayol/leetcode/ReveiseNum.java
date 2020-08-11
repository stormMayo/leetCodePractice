package leetcode;

import org.omg.PortableInterceptor.INACTIVE;

/**
 *
 */
public class ReveiseNum {
    public static void main(String[] argus){
//        [-2147483648, 2147483647]
        int reverse = reverse(-2147483);
        System.out.println(reverse);
    }
    public static int reverse(int x) {
        int rev = 0;
        while (x != 0){
            int i = x % 10;
            x = x / 10;
            if(rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && i > Integer.MAX_VALUE % 10)){
                return 0;
            }else if(rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && i < Integer.MIN_VALUE % 10)){
                return 0;
            }
            rev = rev * 10 + i;
        }
        return rev;
    }
}




