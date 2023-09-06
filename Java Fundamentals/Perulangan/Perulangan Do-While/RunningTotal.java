import java.util.Scanner;

public class RunningTotal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int current, total = 0;

        // if (current == 0) {
        //     System.out.println("Inputan benar");
        // } else {
        //     System.out.println("INputan salah");
        // }
        // System.out.println("Inputan benar adalah 0");
        // do {
        //     current = input.nextInt();
        //     if (current != 0) {
        //         System.out.println("Anda Salah!");
        //     }
        //     System.out.println("");
        // } while (current != 0);
        // System.out.println("Inputan benar");
        System.out.print("Type in a bunch of values and I'll add them up.");
        System.out.println("I'll stop when you type a zero.");

        do {
            System.out.println("Value: ");
            current = input.nextInt();
            total += current;
            System.out.println("The total so far is: " + total);
        } while (current != 0);

        System.out.println("The final total is: " + total);
    }    
}
