import java.util.Scanner;
/* N1 */

public class Uri1018 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N;
        N = entrada.nextInt();

        System.out.println((N/100) + " nota(s) de R$ 100,00");
        N = N % 100;

        System.out.println((N/50) +" nota(s) de R$ 50,00");
        N = N % 50;

        System.out.println((N/20) +" nota(s) de R$ 20,00");
        N = N % 20;

        System.out.println((N/10) +" nota(s) de R$ 10,00");
        N = N % 10;

        System.out.println((N/5) +" nota(s) de R$ 5,00");
        N = N % 5;

        System.out.println((N/2) +" nota(s) de R$ 2,00");
        N = N % 2;

        System.out.println((N/1) +" nota(s) de R$ 1,00");
        N = N % 1;

        entrada.close();

    }
}
