import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter mark for subject " + (i + 1) + " (0-100): ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double average = (double) total / n;

        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\n--- Result ---");
        System.out.println("Total Marks      : " + total + " / " + (n * 100));
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade            : " + grade);

        sc.close();
    }
}