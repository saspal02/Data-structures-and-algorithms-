import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numSubjects = input.nextInt();
        double totalGradePoints = 0;
        double totalCredits = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter the credit for subject " + i + ": ");
            double credits = input.nextDouble();
            totalCredits += credits;
            System.out.print("Enter the grade point for subject " + i + ": ");
            double gradePoints = input.nextDouble();
            totalGradePoints += (credits * gradePoints);
        }
        double cgpa = totalGradePoints / totalCredits;
        System.out.println("CGPA is: " + cgpa);
    }
}
