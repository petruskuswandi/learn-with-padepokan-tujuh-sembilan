import java.util.Scanner;

/**
 * RudeQuestions
 */
public class RudeQuestions {

    public static void main(String[] args) {
        String name, hobby;
        int age;
        double weight, income;

        Scanner input = new Scanner(System.in);

        System.out.print("Hello, What is your name? ");
        name = input.next();

        System.out.print("HI, " + name + "! How old are you? ");
        age = input.nextInt();

        System.out.println("So you're " + age + ", eh? that's not very old.");
        System.out.print("How much do you weight, " + name + "? ");
        weight = input.nextDouble();

        System.out.println(weight + "! Better keep that quiet!!" );
        System.out.print("Finally, what's your income, " + name + "? ");
        income = input.nextDouble();

        System.out.print("Hopefully that is " + income + " per hour");
        System.out.println(" and not per year!");

        System.out.print("What's your hobby " + name + "? ");
        hobby = input.next();
        System.out.println("ohh WOW, your hobby is " + hobby);

        System.out.print("Well, thanks for answering my rude questions. ");
        System.out.println(name + ".");
    }
}