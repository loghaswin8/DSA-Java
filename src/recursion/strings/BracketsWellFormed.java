package recursion.strings;

import recursion.Steps;

import java.lang.reflect.AnnotatedType;
import java.util.ArrayList;
import java.util.Arrays;

public class BracketsWellFormed {
    public static void main(String[] args) {
        ArrayList<String> ans = wellFormed(4, 0,0);
        System.out.println(ans);
    }
    static ArrayList<String> wellFormed (int n, int s, int e) {
        String output = "";
        if (s==n && e == n) {

        }

        ArrayList<String> ans = new ArrayList<>();
        if (s <= n) {
            output += '(';
            ans.add(output);
            wellFormed(n, s+1, e);
        }
        if (s > e) {
            output = output + ')';
            ans.add(output);
            wellFormed(n, s, e+1);
        }

        return ans;
    }
}
