import java.util.Scanner;

public class Uri1174 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double A[] = new double[100];

        for (int i = 0; i < 100; i++) {
            A[i] = entrada.nextDouble();
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i]<=10.0){
                System.out.printf("A[" + i + "] = %.1f\n", A);

            }
        }

        entrada.close();
    }
}
