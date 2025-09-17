import java.util.Scanner;

public class ContrasenaPepito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        long numero = sc.nextLong();  // puede ser grande, por eso usamos long

        int pares = 0;
        int impares = 0;

        long n = numero;
        if (n == 0) {   // caso especial: el 0 se considera par
            pares = 1;
        } else {
            while (n != 0) {
                int digito = (int)(n % 10);  // tomar último dígito
                if (digito % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
                n = n / 10;  // eliminar el último dígito
            }
        }

        System.out.println("Cantidad de dígitos pares: " + pares);
        System.out.println("Cantidad de dígitos impares: " + impares);

        if (pares > impares) {
            System.out.println("Contraseña Aceptada");
        } else {
            System.out.println("Contraseña Rechazada");
        }

        sc.close();
    }
}
