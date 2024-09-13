import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M, N;
        int instancias = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < instancias; i++) {
            M = sc.nextInt();
            N = sc.nextInt();
            sc.nextLine();

            String[] palavras = new String[1000];
            String[] traducoes = new String[1000];

            if (M <= 1000000 && M >= 1 && N >= 1 && N <= 1000) {
                
                for (int j = 0; j < M; j++) {
                    palavras[j] = sc.nextLine();
                    traducoes[j] = sc.nextLine();
                }
                
                for (int x = 0; x < N; x++) {
                    String entrada = sc.nextLine();
                    String[] palavras2 = entrada.split("\\s+");
                    int tamanho = palavras2.length;
                    
                    for (int z = 0; z < tamanho; z++) {
                        for (int k = 0; k < M; k++) {
                            if (palavras2[z].equals(palavras[k])) {
                                palavras2[z] = traducoes[k];
                            }
                        }
                        System.out.printf("%s ", palavras2[z]);
                    }
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}
