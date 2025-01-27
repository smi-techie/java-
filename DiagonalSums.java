import java.util.Scanner;

public class DiagonalSums {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3X3 matrix");
        int[][] matrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;

        for (int i = 0; i < 3; i++) {
            leftDiagonalSum += matrix[i][i]; // Sum of left diagonal elements
            rightDiagonalSum += matrix[i][2 - i]; // Sum of right diagonal elements
        }

        System.out.println("Left=" + leftDiagonalSum);
        System.out.println("Right=" + rightDiagonalSum);

        scanner.close();
    }
}