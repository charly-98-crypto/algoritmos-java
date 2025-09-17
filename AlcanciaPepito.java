import java.util.Scanner;

public class AlcanciaPepito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, suma = 0;

        System.out.println("Ingrese el número N:");
        N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0) {
                suma = suma + i;
            }
        }

        System.out.println("La suma de los múltiplos de 3 entre 1 y " + N + " es: " + suma);
    }
}
