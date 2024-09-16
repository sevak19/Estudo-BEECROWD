import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        List<String> idiomas = new ArrayList<>();
        List<String> traducoes = new ArrayList<>();

        
        for ( int i = 0; i < N; i++ ) {
            idiomas.add(sc.nextLine());
            traducoes.add(sc.nextLine());
        }
        
        int M = sc.nextInt();
        sc.nextLine();
        
        List<String> nomesCriancas = new ArrayList<>();
        List<String> idiomasCriancas = new ArrayList<>();

        for ( int i = 0; i < M; i++ ) {
            nomesCriancas.add(sc.nextLine());
            idiomasCriancas.add(sc.nextLine());
        }

        for ( int i = 0; i < M; i++ ) {
            for (int j = 0; j < N;j++){
                if (idiomasCriancas.get(i).equals(idiomas.get(j))) {
                    System.out.println(nomesCriancas.get(i));
                    System.out.println(traducoes.get(j));
                    System.out.println();
                }
            }
        }

        sc.close();
    }
}
