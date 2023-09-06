/**
 * ujianakhir
 */
public class ujianakhir {

    public static void main(String[] args) {
        int T = 30;

if (T < 0) {
    System.out.println("Wujud air adalah beku " + T);
} else if ((0 <= T) && (T <= 100)) {
    System.out.println("Wujud air adalah cair " + T);
} else if (T > 100) {
    System.out.println("Wujud air berupa gas atau uap " + T);
}
    }
}