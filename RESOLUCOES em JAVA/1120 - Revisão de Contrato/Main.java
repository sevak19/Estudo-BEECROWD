import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String entrada = sc.nextLine();
        String[] divisao = entrada.split(" ");

        while(!divisao[0].equals("0") && !divisao[1].equals("0")){
            divisao[1] = divisao[1].replace(divisao[0], "");
            
            long resp = Long.parseLong(divisao[1]);
            System.out.println(resp);
            
            entrada = sc.nextLine();
        }

        sc.close();
    }
}
