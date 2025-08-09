package Day_1.Loops;

import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        int n = (int)(Math.random() * 10) + 1; // random number 1-10
        int guess;

        Scanner s = new Scanner(System.in);

        System.out.println("Try to guess the number between 1 and 10:");
        guess = s.nextInt(); // first guess

        while (guess != n) {
            if (guess < n) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
            System.out.println("Try again:");
            guess = s.nextInt(); // ask again
        }

        System.out.println("🎉 You got it! The number was " + n);

        s.close();
    }
}
