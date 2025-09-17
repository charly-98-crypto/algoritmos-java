import java.util.Scanner;

public class NumeroInvertido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();

        int invertido = 0;
        int n = numero;

        while (n != 0) {
            int digito = n % 10;         // Tomamos el último dígito
            invertido = invertido * 10 + digito; // Lo agregamos al número invertido
            n = n / 10;                  // Eliminamos el último dígito
        }

        System.out.println("Número invertido: " + invertido);

        sc.close();
    }
}
