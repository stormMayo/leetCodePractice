import java.util.HashMap;
import java.util.Map;

/**
 * 13
 */
public class RomanToInt {
    public static void main(String[] argus){
        int result = romanToInt("MCMXCIV");
        System.out.println(result);
        int iv = romanToInt2("IV");


    }

    /**
     * 字符          数值
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     */
    public static int romanToInt(String s) {
        Map<Character,Integer> romanMap = new HashMap<Character,Integer>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);
        char[] chars = s.toCharArray();
        int sum = 0;
//        MCMXCIV
        for (int i = 0; i < chars.length; i++) {
            if(i+1 < chars.length){
                //判断加减
                if(romanMap.get(chars[i]) < romanMap.get(chars[i+1])){
                    sum =  sum  + (romanMap.get(chars[i+1]) - romanMap.get(chars[i]));
                    i += 1;
                }else {
                    sum += romanMap.get(chars[i]);
                }
            }else {
                sum += romanMap.get(chars[chars.length-1]);
            }
        }
        return sum;
    }

    public static int romanToInt2(String s) {
        int sum = 0;
        int preNum = getValue(s.charAt(0));
        for(int i = 1;i < s.length(); i ++) {
            int num = getValue(s.charAt(i));
            if(preNum < num) {
                sum -= preNum;
            } else {
                sum += preNum;
            }
            preNum = num;
        }
        sum += preNum;
        return sum;
    }
    private static int getValue(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }



}

