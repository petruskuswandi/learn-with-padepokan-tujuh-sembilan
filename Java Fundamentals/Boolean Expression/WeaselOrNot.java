import java.util.Scanner;

/**
 * WeaselOrNot
 */
public class WeaselOrNot {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kata = "weasel";
        String word;
        boolean yep, nope;

        System.out.printf("Type the word \"%s\" please. \n", kata);
        word = input.nextLine();
        yep = word.equals("weasel");
        nope = ! word.equals("weasel");

        System.out.println("You typed what was requested: " + yep);
        System.out.println("You ignored polite instructions: " + nope);
    }
}