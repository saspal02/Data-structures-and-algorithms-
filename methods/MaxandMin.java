import java.util.Scanner;
public class MaxandMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double first = input.nextDouble();
        System.out.println("Enter the second number: ");
        double second = input.nextDouble();
        System.out.println("Enter the third number: ");
        double third = input.nextDouble();
        double largest = largest(first,second,third);
        double smallest = smallest(first,second,third);
        System.out.printf("The largest number is: "+ largest);
        System.out.printf("The Smallest number is: "+ smallest);
    }

    public static double largest(double first, double second, double third){
        double max = first;
        if(second>first){
            max = second;
        }
        if(third>max){
            max = third;
        }
        return max;

    }

    public static double smallest(double first, double second, double third){
        double min =first;
        if(second<first){
            min = second;
        }
        if(third<min){
            min = third;
        }

        return min;
    }
}
