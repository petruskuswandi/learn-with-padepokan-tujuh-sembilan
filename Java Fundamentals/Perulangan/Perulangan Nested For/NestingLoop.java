public class NestingLoop {
    public static void main(String[] args) {
        for (char c = 'A'; c <= 'E'; c++) {
            for (int i = 1; i <= 3; i++) {
                System.out.println(c + " " + i);
            }
        }

        System.out.println("\n");

        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                System.out.print("(" + a + "," + b + ")");
            }
            System.out.println();
        }

        System.out.println("\n");
    }    

}
