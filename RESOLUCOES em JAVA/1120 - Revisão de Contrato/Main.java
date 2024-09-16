import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String entrada = sc.nextLine();
        String[] divisao = entrada.split(" ");

        while(!divisao[0].equals("0") && !divisao[1].equals("0")){
            divisao[1] = divisao[1].replace(divisao[0], "");

            if(divisao[1].equals("")){
                System.out.println(0);
            } else {
                BigInteger resp = new BigInteger(divisao[1]);
                System.out.println(resp);
            }
            
            entrada = sc.nextLine();
            divisao = entrada.split(" ");
        }

        sc.close();
    }
}
