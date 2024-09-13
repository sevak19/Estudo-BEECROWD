import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()){
            double valor = Double.parseDouble(sc.nextLine());
            double corte = Double.parseDouble(sc.nextLine());
            double decimal = valor - Math.floor(valor);
            if(decimal > corte) {
                System.out.printf("%.0f\n", Math.ceil(valor));
            } else {
                System.out.printf("%.0f\n", Math.floor(valor));
            }
        }

        sc.close();
    }
}