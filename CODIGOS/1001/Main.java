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
 
        int A, B, X;
        
        Scanner scan = new Scanner(System.in);
        
        A = scan.nextInt();
        B = scan.nextInt();
        
        X = A + B;
        
        System.out.println("X = " + X);
        
        scan.close();
 
    }
 
}