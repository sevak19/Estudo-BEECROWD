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
        
        String linha = sc.nextLine();
        String[] partes = linha.split(" ");
        
        double A = Double.parseDouble(partes[0]);
        double B = Double.parseDouble(partes[1]);
        double C = Double.parseDouble(partes[2]);
        
        double tri = (A*C)/2;
        double cir = 3.14159 * Math.pow(C,2);
        double tra = ((A+B)*C)/2;
        double qua = Math.pow(B,2);
        double ret = A * B;
        
        System.out.printf("TRIANGULO: %.3f%n", tri);
        System.out.printf("CIRCULO: %.3f%n", cir);
        System.out.printf("TRAPEZIO: %.3f%n", tra);
        System.out.printf("QUADRADO: %.3f%n", qua);
        System.out.printf("RETANGULO: %.3f%n", ret);
        
        sc.close();
    }
 
}
