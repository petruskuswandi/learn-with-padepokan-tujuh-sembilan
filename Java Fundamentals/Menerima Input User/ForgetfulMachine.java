import java.util.Scanner;

/**
 * ForgetfulMachine
 */
public class ForgetfulMachine {

    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        System.out.println("What city is the capital of France? ");
        inputan.next();

        System.out.println("What is 6 multiplied by 7? ");
        inputan.nextInt();

        System.out.println("Enter a number beetwen 0.0 and 0.1? ");
        inputan.nextDouble();

        System.out.println("Is there anything else you would like to say? ");
        inputan.next();
    }
}