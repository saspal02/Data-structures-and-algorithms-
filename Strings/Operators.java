import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char) ('a' + 3));

        System.out.println("a" + 1);
        // this is same as after a few steps: "a" + "1"
        //Integer will be converted to integer that will call toString()

        System.out.println("Saswat" + new ArrayList<>());
        System.out.println("Saswat" +  Integer.valueOf(56));
        String ans =  Integer.valueOf(56) + "" + new ArrayList<>();
        System.out.println(ans);
    }
}
