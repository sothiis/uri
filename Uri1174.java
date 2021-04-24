import java.util.Scanner;
/* N1 */

public class Uri1174 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float A[] = new float[100];

        for (int i = 0; i < A.length; i++) {
            A[i] = entrada.nextFloat();
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i]<=10.0){
                System.out.println("A[" + i + "] = " + A[i]);
                entrada.close();

            }
        }

    
    }
}
