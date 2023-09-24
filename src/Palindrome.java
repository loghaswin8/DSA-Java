import java.lang.reflect.Array;
import java.util.Arrays;

class Palindrome {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
       String s = Integer.toString(x);
       for (int i = 0; i <= s.length()/ 2; i++) {
           int start = s.charAt(i);
           int end = s.charAt(s.length() - 1 - i);

           if (start != end) {
               return false;
           }
       }
       return true;
    }


}