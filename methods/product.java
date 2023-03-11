import java.util.Scanner;
public class product{

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
// create scanner object

        System.out.print("Enter the first number: ");

        int num1=sc.nextInt();
//this method reads value for num1 providing by user

        System.out.print("Enter the second number: ");

        int num2=sc.nextInt();
//this method reads value for num2 providing by user

        sc.close();//closing the scanner class

        calcProduct(num1,num2); //calling the method

    }
    //calcTotal method
    public static void calcProduct(int x,int y){
        int result=0;
        result=x*y;
        System.out.println("product of two numbers  "+result);


    }
}