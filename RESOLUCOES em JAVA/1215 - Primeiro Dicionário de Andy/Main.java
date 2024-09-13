import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List<String> entrada = new ArrayList<>();
        List<String> palavras = new ArrayList<>();

        while(sc.hasNextLine()){
            entrada.add(sc.nextLine());
        }
        for(String linha : entrada){
            linha = linha.replaceAll("[.,;:!\"'()$#*]" , " ");
            String[] palavrasLinha = linha.toLowerCase().split(" ");
            for(String palavra : palavrasLinha){
                palavras.add(palavra);
            }
        }
        for(int i = 1; i < palavras.size(); i++){
            String chave = palavras.get(i);
            int j = i - 1;
            while( (j >= 0) && chave.compareTo(palavras.get(j)) < 0) {
                palavras.set(j + 1, palavras.get(j));
                j--;
            }
            palavras.set(j += 1, chave);
        }
        for(int i = 1; i < palavras.size(); i++){
            String chave = palavras.get(i);
            for(int j = i - 1; j >=0; j--){
                if(chave.compareTo(palavras.get(j)) == 0){
                    palavras.remove(i);
                    i--;
                    j = -1;
                }
            }
        }
        for(String palavra : palavras){
            if(palavra.length() > 0){
                System.out.println(palavra);
            }
        }
        sc.close();
    }
}