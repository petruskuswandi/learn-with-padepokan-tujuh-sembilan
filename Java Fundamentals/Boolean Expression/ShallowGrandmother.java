import java.util.Scanner;

/**
 * ShallowGrandMother
 */
public class ShallowGrandmother {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        double income, cute;
        boolean allowed;

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.print("Enter you yearly income: ");
        income = input.nextDouble();

        System.out.print("How cute are you, on scale from 0.0 to 10.0? ");
        cute = input.nextDouble();

        allowed = (age > 20 && age < 40 && (income > 50000 || cute >= 8.5) );
        System.out.println("Allowed to date my grandchild? " + allowed);
    }
}