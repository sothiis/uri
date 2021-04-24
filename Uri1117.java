import java.util.Scanner;
/* N1 */

public class Uri1117 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double notas[];
        notas = new double[2];

        int cont = 0;
        double nota;

        while (cont <= 1) {
            nota = entrada.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("nota invalida");
            } else {
                notas[cont++] = nota;
            }
        }

        double media = (notas[0] + notas[1])/2;

        System.out.printf("media =  %.2f\n ", media);

        entrada.close();
    }
}
