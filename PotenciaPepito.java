import java.util.Scanner;

public class PotenciaPepito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la base (a): ");
        int a = sc.nextInt();

        System.out.print("Ingrese el exponente (b) (entero no negativo): ");
        int b = sc.nextInt();

        if (b < 0) {
            System.out.println("Este programa no soporta exponentes negativos.");
            sc.close();
            return;
        }

        long resultado = 1;              
        for (int i = 0; i < b; i++) 
        {
            resultado = resultado * a;    
        }

        System.out.println(a + " elevado a " + b + " = " + resultado);
        sc.close();
    }
}
