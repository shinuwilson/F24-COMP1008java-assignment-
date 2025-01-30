import java.util.Random;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Task2();
    }

    public static void Task2() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Creating 10*10 multiplication table
        int[][] table = new int[10][10];

        // multiplication table
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                table[i][j] = (i + 1) * (j + 1); // Multiplication table
            }
        }

        // Asking the user how many questions they want to answer.
        System.out.print("How many multiplication questions do you want to continue?: ");
        int n = sc.nextInt();

        int correctAnswers = 0;

        // Ask the questions in a loop
        for (int i = 0; i < n; i++) {
            int row = rand.nextInt(10);
            int col = rand.nextInt(10);

            int correctAnswer = table[row][col]; // The correct answer for this question

            // Display the question
            System.out.print("What is " + (row + 1) + " x " + (col + 1) + "? ");
            int userAnswer = sc.nextInt();

            // Checking the answers
            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
                correctAnswers++; // Increment the correctAnswers count
            } else {
                System.out.println("Incorrect!. The correct answer is: " + correctAnswer);
            }
        }

        // Summary
        int percentage = (int) Math.round((double) correctAnswers / n * 100);
        System.out.println("\nSummary:");
        System.out.printf("you answered %d out of %d questions correctly\n", correctAnswers, n);
        System.out.printf("That's a percentage of %d%%\n", percentage);

        sc.close();
    }
}
