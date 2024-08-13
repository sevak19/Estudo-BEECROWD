import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        double n = 3.14159;
        double raio;
        
        Scanner scan = new Scanner(System.in);
        
        raio = scan.nextDouble();
        
        double area = n * (raio*raio);
        
        System.out.printf("A=%.4f", area);
        
        scan.close();
 
    }
 
}