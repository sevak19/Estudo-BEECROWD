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
 
        int A, B, C;
        
        Scanner sc = new Scanner(System.in);
        
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        
        A = (A+B+Math.abs(A-B))/2;
        A = (A+C+Math.abs(A-C))/2;
        
        System.out.println(A+" eh o maior");
        
        sc.close();
 
    }
 
}