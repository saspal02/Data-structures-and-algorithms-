package Strings;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        //subsequence("", "abc");
        System.out.println(subseqAsciiReturn("","ab"));

    }

    static void subsequence(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;

        }

        char ch = up.charAt(0);
        subsequence(p + ch, up.substring(1));
        subsequence(p, up.substring(1));
    }

    static ArrayList<String> subseqReturn(String p,String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqReturn(p + ch, up.substring(1));
        ArrayList<String> right = subseqReturn(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    static void subseqAscii(String p,String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqAscii(p + ch, up.substring(1));
        subseqAscii(p + (int)ch, up.substring(1));
        subseqAscii(p, up.substring(1));
    }

    static ArrayList<String> subseqAsciiReturn(String p,String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqAsciiReturn(p + ch, up.substring(1));
        ArrayList<String> right = subseqAsciiReturn(p + (int)ch, up.substring(1));
        ArrayList<String> mid = subseqAsciiReturn(p, up.substring(1));

        left.addAll(right);
        left.addAll(mid);
        return left;
    }

}
