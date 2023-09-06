import java.io.BufferedReader;
import java.util.Scanner;

/**
 * CalculateMoneySpent
 */
public class CalculateMoneySpent {

    public static void main(String[] args) {
        String name;
        int moneySpent, total, totalDay;
        Double average;

        Scanner input = new Scanner(System.in);

        System.out.println("Calculate Your Money!!!");
        System.out.println();

        System.out.println("Hey, What is your name?");
        name = input.nextLine();

        total = 0;
        
        System.out.println("How much money did you spend at the club on Monday?");
        moneySpent = input.nextInt();
        total += moneySpent;

        System.out.println("How much money did you spend at the club on Monday?");
        moneySpent = input.nextInt();
        total += moneySpent;
        
        System.out.println("How much money did you spend at the club on Monday?");
        moneySpent = input.nextInt();
        total += moneySpent;
        
        System.out.println("How much money did you spend at the club on Monday?");
        moneySpent = input.nextInt();
        total += moneySpent;

        System.out.println("How much money did you spend at the club on Monday?");
        moneySpent = input.nextInt();
        total += moneySpent;

        System.out.println("How much money did you spend at the club on Monday?");
        moneySpent = input.nextInt();
        total += moneySpent;

        System.out.println("How much money did you spend at the club on Monday?");
        moneySpent = input.nextInt();

        total += moneySpent;

        
        System.out.println("The Calculation Results:");
        System.out.println("Hi " + name + ".");
        System.out.println("Your total expenditure at he club this week is $ " + total);
        totalDay = 7;
        average =  (double) total /totalDay;
        System.out.println("With an Average daily expenditure of $ " + average);
        System.out.println();
    }
}