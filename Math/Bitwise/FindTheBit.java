package Bitwise;

public class FindTheBit {
    public static void main(String[] args) {
        int number = 2;
        int i = 3;
        int bit = findthebit(number,i);
        System.out.println("The bit is " + bit);
    }

    public static int  findthebit(int number,int i) {
        return (number >> (i -1)) & 1;


    }

}
