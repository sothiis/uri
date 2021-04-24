import java.util.Scanner;

public class Uri1080 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N = entrada.nextInt();
        
        int X[];
        X = new int[N];

        int menorElemento = 0;
        int posicaoVetor = 0;

        for (int i = 0; i < N; i++) {
            X[i] = entrada.nextInt();
            if (i == 0) {
                menorElemento = X[i];
                posicaoVetor = i;
            } else if (X[i] < menorElemento) {
                menorElemento = X[i];
                posicaoVetor = i;
            }
        }
        System.out.println("Menor valor: " + menorElemento);
        System.out.println("Posicao: " + posicaoVetor);

        entrada.close();
    }

}
