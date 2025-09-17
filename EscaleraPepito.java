import java.util.Scanner;

public class EscaleraPepito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el número de escalones: ");
        int N = sc.nextInt();
        
        int total = 0;
        
        for (int i = 1; i <= N; i++) {
            total += i;
        }
        
        System.out.println("Pepito necesita " + total + " bloques en total.");
        
        sc.close();
    }
}
