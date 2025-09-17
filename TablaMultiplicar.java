import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número N: ");
        int N = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = N * i;
            if (resultado % 4 == 0) {
                System.out.println(N + " x " + i + " = " + resultado);
            }
        }

        sc.close();
    }
}
