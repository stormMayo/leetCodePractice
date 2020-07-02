/**
 14:编写一个函数来查找字符串数组中的最长公共前缀。

 如果不存在公共前缀，返回空字符串 ""。

 示例 1:
 输入: ["flower","flow","flight"]
 输出: "fl"
 */
public class LongestCommonPrefix14 {
    public static void main(String[] argus){
        String[] s = {"flower","flow","flight"};
        String s1 = solutionOne(s);
        System.out.println(s1);

        String s2 = solutionTwo(s);
        System.out.println(s2);

    }
    private static String solutionOne(String[] strs){

        if(strs == null  || strs.length == 0){
            return "";
        }
        String firstStr = strs[0];
        int m = strs.length;
        for (int i = 1; i < m ; i++) {
            firstStr = longestCommonPrefix(firstStr, strs[i]);
            if(firstStr.length() == 0){
                return "";
            }
        }
        return firstStr;
    }

    private static String longestCommonPrefix(String str1,String str2){
        int index = 0;
        int min = Math.min(str1.length(), str2.length());
        while (index < min && str1.charAt(index) == str2.charAt(index)){
            index++;
        }
        return str1.substring(0,index);
    }


    private static String solutionTwo(String[] strs){
        if(strs == null || strs.length ==0){
            return "";
        }
        String firstStr = strs[0];
        char[] chars = firstStr.toCharArray();
        int count = strs.length;
        for (int i = 0; i < chars.length ; i++) {
            for (int j = 1; j < count ; j++) {
                if(i == strs[j].length() ||  chars[i] != strs[j].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }

    }
