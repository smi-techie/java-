import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the mark: ");
        int mark = scanner.nextInt();

        String grade;

        if (mark >= 90) {
            grade = "O";
        } else if (mark >= 80) {
            grade = "E";
        } else if (mark >= 70) {
            grade = "A";
        } else if (mark >= 60) {
            grade = "B";
        } else {
            grade = "C";
        }

        System.out.println("Grade: " + grade);

        scanner.close();
    }
}