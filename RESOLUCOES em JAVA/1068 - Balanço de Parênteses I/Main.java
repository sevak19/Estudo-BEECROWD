import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()){
            String entrada = sc.nextLine();

            int parenteses = 0;
            int verificacao = 1;

            for ( int i = 0; i < entrada.length(); i++) {
                if ( entrada.charAt(i) == '(' ) {
                    parenteses++;
                } else if ( entrada.charAt(i) == ')' ) {
                    parenteses--;
                    if(parenteses < 0) {
                        verificacao = 0;
                    }
                }
            }
            
            if(parenteses == 0 && verificacao == 1) {
                System.out.println("correct");
            }else{
                System.out.println("incorrect");
            }
        }

        sc.close();
    }
}