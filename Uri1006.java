import java.util.Scanner;
/* N1 */


public class Uri1006 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c, media;

        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();

        media = (a * 2 + b * 3 + c * 5) / 10;

        System.out.printf("MÉDIA = %.1f\n", media);

        entrada.close();

    }
}
