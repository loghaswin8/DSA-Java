package recursion.strings;

import java.util.ArrayList;
import java.util.Arrays;

public class Subset {
    public static void main(String[] args) {
        //subseq("", "abc");
        System.out.println(subseqRet("", "abc"));

    }
    static void subseq(String p, String up) {
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    static ArrayList<String> subseqRet(String p, String up) {
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left =  subseqRet(p + ch, up.substring(1));
        ArrayList<String> right =  subseqRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    static ArrayList<String> subseqRetAscii(String p, String up) {
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> first =  subseqRetAscii(p + ch, up.substring(1));
        ArrayList<String> second =  subseqRetAscii(p, up.substring(1));
        ArrayList<String> third =  subseqRetAscii(p + (ch + 0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
