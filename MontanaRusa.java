import java.util.Scanner;

public class MontanaRusa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, altura = 0;

        System.out.println("Ingrese el número de tramos (N):");
        N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {   // si es par, resta
                altura = altura - i;
            } else {            // si es impar, suma
                altura = altura + i;
            }
        }

        System.out.println("La altura final de la montaña rusa es: " + altura);
    }
}
