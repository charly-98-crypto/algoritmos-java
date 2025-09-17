import java.util.Scanner;

public class PastelFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el número N para el factorial: ");
        int N = sc.nextInt();

        long factorial = 1;

        for (int i = 1; i <= N; i++) {
            factorial *= i;

            // Si el factorial supera 10.000, ya sabemos que es imposible
            if (factorial > 10000) {
                System.out.println("La receta es imposible");
                sc.close();
                return; // Salimos del programa
            }
        }

        // Si llegamos aquí, el factorial es <= 10.000
        System.out.println("El factorial de " + N + " es: " + factorial);

        sc.close();
    }
}

