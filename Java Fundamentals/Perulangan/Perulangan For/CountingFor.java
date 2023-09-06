import java.util.Scanner;

public class CountingFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String message;

        System.out.println("Enter a message and I'll display it five times");
        System.out.print("Message: ");
        message = input.nextLine();

        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ". " + message);
        }

        System.out.println("\nNow I'll show it ten times and count by $a.");
        for (int i = 5; i < 50; i+=5) {
            System.out.println(i + ". " + message);
        }

        System.out.println("\nFinally, three times counting backward");
        for (int i = 3; i > 0; i-=1) {
            System.out.println(i + ". " + message);
        }
        
    }
}
