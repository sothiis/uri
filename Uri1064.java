import java.util.Scanner;

public class Uri1064 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x = 0;
        float y = 0;

        for (int i = 0; i < 6; i++) {
            float numero;
            numero = entrada.nextFloat();
            if (numero > 0) {
                x = x + 1;
                y = y + numero;
            }
        }
        System.out.println(x + " valores positivos");
        System.out.printf("%.1f\n", (y / x));

        entrada.close();

    }
}