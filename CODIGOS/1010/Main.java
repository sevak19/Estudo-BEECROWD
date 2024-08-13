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
        
        String linha1 = sc.nextLine();
        String[] partes1 = linha1.split(" ");
        
        int cod1 = Integer.parseInt(partes1[0]);
        int quant1 = Integer.parseInt(partes1[1]);
        double valor1 = Double.parseDouble(partes1[2]);
        
        String linha2 = sc.nextLine();
        String[] partes2 = linha2.split(" ");
        
        int cod2 = Integer.parseInt(partes2[0]);
        int quant2 = Integer.parseInt(partes2[1]);
        double valor2 = Double.parseDouble(partes2[2]);
        
        double valor = (valor1*quant1)+(valor2*quant2);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valor);
        
        sc.close();
 
    }
 
}