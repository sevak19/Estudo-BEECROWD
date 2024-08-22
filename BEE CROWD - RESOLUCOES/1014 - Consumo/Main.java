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
        
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        float Y = sc.nextFloat();
        float resultado;
        
        resultado = (float) X/Y;
        
        System.out.printf("%.3f km/l\n", resultado);
        
        sc.close();
        
    }
 
}