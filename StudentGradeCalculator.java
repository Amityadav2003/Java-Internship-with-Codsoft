import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        // Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Declare variables for storing marks
        double Math, Physics, Chemistry, English, Hindi;
        double total, percentage;
        char grade;

        // Input marks for each subject
        System.out.print("Enter marks for Math : ");
        Math = scanner.nextDouble();

        System.out.print("Enter marks for Physics : ");
        Physics = scanner.nextDouble();

        System.out.print("Enter marks for Chemistry : ");
        Chemistry = scanner.nextDouble();

        System.out.print("Enter marks for English : ");
        English = scanner.nextDouble();

        System.out.print("Enter marks for Hindi : ");
        Hindi = scanner.nextDouble();

        // Calculate total and percentage
        total = Math + Physics + Chemistry + English + Hindi;
        percentage = (total / 500) * 100;

        // Determine the grade based on percentage
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // Display the results
        System.out.println("\nTotal Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");
        System.out.println("Grade = " + grade);

        // Close the scanner object
        scanner.close();
    }
}
