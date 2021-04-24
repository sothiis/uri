import java.util.Scanner;

public class Uri1014 {
 public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int x;
    double y;

    x=entrada.nextInt();
    y=entrada.nextDouble();

    double total = (x / y);


    System.out.printf("%.3f" + " km/l\n", total);

    entrada.close();
 }   
}
