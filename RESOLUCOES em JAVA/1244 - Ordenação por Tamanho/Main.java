import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < N;i++) {
            String entrada = sc.nextLine();
            String[] vetor = entrada.split(" ");
            for(int j = 1; j < vetor.length; j++){
                String tmp = vetor[j];
                int k = j - 1;
                while ((k >= 0) && (vetor[k].length() < tmp.length())) {
                    vetor[k + 1] = vetor[k];
                    k--;
                }
                vetor[k + 1] = tmp;
            }
            for(int j = 0;j < vetor.length;j++){
                if(j == vetor.length-1){
                    System.out.printf("%s", vetor[j]);
                }else{
                    System.out.printf("%s ", vetor[j]);

                }
            }
            System.out.println();
        }

        sc.close();
    }
}
