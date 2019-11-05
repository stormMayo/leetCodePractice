import java.util.HashSet;
import java.util.Set;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 */
public class LongestNumber {
    public int lengthOfLongestSubstring(String s) {
        for(int i= 0 ; i < s.length() ; i++){
            s.charAt(i);
        }
        //TDDO
        return 0;
    }
    private boolean allUnique(String s, int start,int end){
        Set<Character> set = new HashSet<Character>();
        for(int i = start ; i < end ; i++){
            Character ch = s.charAt(i);
            if(set.contains(ch)){
                return false;
            }
            set.add(ch);
        }
        return true;
    }


}
