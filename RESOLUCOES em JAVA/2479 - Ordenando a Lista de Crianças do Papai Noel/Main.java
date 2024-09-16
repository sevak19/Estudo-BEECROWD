import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        List<String> criancas = new ArrayList<>();
        List<String> nomes = new ArrayList<>();

        for ( int i = 0; i < N; i++ ) {
            criancas.add( sc.nextLine() );
        }

        int Comportaram = 0;
        int NaoComportaram = 0;

        for ( String crianca : criancas ) {
            if ( crianca.charAt(0) == '+' ) {
                Comportaram++;
            } else {
                NaoComportaram++;
            }
            nomes.add(crianca.substring(2));
        }

        for ( int i = 1; i < nomes.size(); i++ ) {
            String menor = nomes.get(i);
            int j = i - 1;
            while ( j>=0 && menor.compareTo(nomes.get(j)) < 0) {
                nomes.set( j+1, nomes.get(j) );
                j--;
            }
            nomes.set(j+1, menor);
        }

        for ( String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("Se comportaram: " + Comportaram + " | Nao se comportaram: " + NaoComportaram);

        sc.close();
    }
}