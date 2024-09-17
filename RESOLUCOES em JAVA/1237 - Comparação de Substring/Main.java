import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()) {
            String entrada1 = sc.nextLine();
            String entrada2 = sc.nextLine();
            int tamanho;

            if( entrada1.length() > entrada2.length() ) {
                tamanho = entrada1.length();
            } else {
                tamanho = entrada2.length();
            }

            int maior = 0;

            for ( int i = 1; i <= tamanho; i++ ) {

                for ( int j = 0; j <= entrada1.length() - i; j++ ) {

                    String substring = entrada1.substring(j, j + i);

                    if ( entrada2.contains(substring) && substring.length() > maior) {
                        maior = substring.length();
                    }

                }

            }
            System.out.println(maior);
        }

        sc.close();
    }
}