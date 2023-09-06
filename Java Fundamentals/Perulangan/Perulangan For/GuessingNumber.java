import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secret, guess;
        boolean pass = false;

        secret = 1 + (int)(Math.random()*10);
        System.out.println("I am thinking of a number from 1 to 10.");
        System.out.println("You must guess what it is in three tries.");
        System.out.println("Enter a guest: ");

        for (int i = 0; i < 3; i++) {
        guess = input.nextInt();
            if (guess == secret) {
                System.out.println("RIGHT");
                System.out.println("You have won the game.");
                pass = true;
                break;
            } else if (Math.abs(guess - secret) == 1) {
                System.out.println("hot");
            } else if (Math.abs(guess - secret) == 2) {
                System.out.println("warm");
            } else {
                System.out.println("cold");
            }
        }

        if (pass == false) {
            System.out.println("wrong.");
            System.out.println("The correct number was " + secret + ".");
            System.out.println("You have lost the game.");   
        }
    }   
}
