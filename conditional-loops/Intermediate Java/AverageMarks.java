import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        double[] marks = new double[numSubjects];
        double sum = 0.0;
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
            sum += marks[i];
        }
        double average = sum / numSubjects;
        System.out.println("The average marks is " + average);
        scanner.close();
    }
}
