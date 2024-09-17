import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String entrada;
        
        while(sc.hasNextLine()) {
            Map<Integer, Integer> contagem = new HashMap<>();

            entrada = sc.nextLine();
            char[] caracteres = new char[entrada.length()];

            for ( int i = 0; i < entrada.length(); i++ ) {

                caracteres[i] = entrada.charAt(i);

                int valor = (int) caracteres[i];

                contagem.put(valor, contagem.getOrDefault(valor, 0) + 1);
            }
            
            List<Map.Entry<Integer, Integer>> listaContagem = new ArrayList<>(contagem.entrySet());
            
            listaContagem.sort(Map.Entry.comparingByValue());

            for (Map.Entry<Integer, Integer> valor : listaContagem) {
                System.out.println(valor.getKey() + " " + valor.getValue());
            }

        }
        sc.close();
    }
}