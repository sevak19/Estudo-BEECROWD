import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int A, B, C, D, DIFERENCA;
        
        Scanner sc = new Scanner(System.in);
        
        A = sc.nextInt();
        
        B = sc.nextInt();
        
        C = sc.nextInt();
        
        D = sc.nextInt();
        
        DIFERENCA = (A*B)-(C*D);
        
        System.out.println("DIFERENCA = "+DIFERENCA);
        
        sc.close();
 
    }
 
}

