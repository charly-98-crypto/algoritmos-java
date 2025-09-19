package Feria;

import java.util.Scanner;

public class PepitoFeria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---------- 1. La Torre de la Suma ----------
        System.out.print("Ingresa el número N para la Torre de la Suma: ");
        int N = sc.nextInt();

        int suma = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 5 == 0) {
                suma += i;
            }
        }
        System.out.println("Suma de múltiplos de 5: " + suma);
        if (suma > 100) {
            System.out.println("¡Pepito gana un pase especial!");
        } else {
            System.out.println("Pepito pasa al siguiente puesto sin pase especial.");
        }

        // ---------- 2. La Prueba de los Naranjos ----------
        System.out.print("\nIngresa el número de árboles (N) para la Prueba de los Naranjos: ");
        int arboles = sc.nextInt();

        int naranjas = 0;
        for (int i = 1; i <= arboles; i++) {
            if (i % 2 == 0) {
                naranjas += 2;
            } else {
                naranjas += 1;
            }
        }
        System.out.println("Pepito obtuvo " + naranjas + " naranjas en total.");

        // ---------- 3. El Espejo Encantado ----------
        System.out.print("\nIngresa el número N para el Espejo Encantado: ");
        int numero = sc.nextInt();

        int invertido = 0, temp = numero;
        while (temp > 0) {
            int digito = temp % 10;
            invertido = invertido * 10 + digito;
            temp /= 10;
        }
        System.out.println("El espejo muestra: " + invertido);

        // ---------- 4. La Puerta de los Dígitos ----------
        System.out.print("\nIngresa el número N para la Puerta de los Dígitos: ");
        int codigo = sc.nextInt();

        int pares = 0, impares = 0;
        int aux = codigo;
        while (aux > 0) {
            int digito = aux % 10;
            if (digito % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            aux /= 10;
        }

        System.out.println("Dígitos pares: " + pares);
        System.out.println("Dígitos impares: " + impares);

        if (pares > impares) {
            System.out.println("Acceso concedido. ¡Pepito logró salir de la feria!");
        } else {
            System.out.println("Acceso denegado. Pepito quedó atrapado para siempre.");
        }

        sc.close();
    }
}