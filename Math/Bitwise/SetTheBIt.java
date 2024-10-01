package Bitwise;

public class SetTheBIt {
    public static void main(String[] args) {
        int number = 13;
        int i = 3;
        int bit = setTheBit(number,i);
        System.out.println("The bit is " + bit);
    }

    public static int  setTheBit(int number,int i) {
        return number | (1 << (i - 1));


    }
}
