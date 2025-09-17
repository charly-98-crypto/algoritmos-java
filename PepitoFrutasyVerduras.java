import java.util.Scanner;

public class PepitoFrutasyVerduras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el número total de niños (N): ");
        int N = sc.nextInt();

        int sumaManzana = 0;
        int sumaNaranja = 0;
        int contadorManzana = 0;
        int contadorNaranja = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) { // Número par
                sumaManzana += i;
                contadorManzana++;
            } else { // Número impar
                sumaNaranja += i;
                contadorNaranja++;
            }
        }

        double promedioManzana = (contadorManzana > 0) ? (double)sumaManzana / contadorManzana : 0;
        double promedioNaranja = (contadorNaranja > 0) ? (double)sumaNaranja / contadorNaranja : 0;

        System.out.println("Promedio de números con manzana: " + promedioManzana);
        System.out.println("Promedio de números con naranja: " + promedioNaranja);

        sc.close();
    }
}
