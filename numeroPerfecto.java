import java.util.Scanner;

public class numeroPerfecto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de la piedra mágica: ");
        int num = sc.nextInt();

        int suma = 0;

        // Recorremos hasta num-1 para sumar los divisores
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }

        if (suma == num) {
            System.out.println(num + " es un número PERFECTO.");
        } else {
            System.out.println(num + " NO es un número perfecto.");
        }

        sc.close();
    }
}
