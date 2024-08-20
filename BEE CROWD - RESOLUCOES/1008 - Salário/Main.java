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
 
        int NUM, HORAS;
        float VALOR, SALARIO;
        
        Scanner sc = new Scanner(System.in);
        
        NUM = sc.nextInt();
        
        HORAS = sc.nextInt();
        
        VALOR = sc.nextFloat();
        
        SALARIO = VALOR * HORAS;
        
        System.out.printf("NUMBER = %d%n", NUM);
        
        System.out.printf("SALARY = U$ %.2f%n", SALARIO);
        
        sc.close();
 
    }
 
}