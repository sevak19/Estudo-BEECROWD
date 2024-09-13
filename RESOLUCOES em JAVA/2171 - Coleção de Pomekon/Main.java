import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
    static final int TOTAL = 151;

    static List<String> exclusivesPomekons(String[] allPomekons) {
        if(allPomekons == null)
            return null;

        List<String> list = new ArrayList<>();

        for (String p : allPomekons) {

            boolean taRepetindoPrc = false;

            for(String s : list) {
                if(p.equals(s)) {
                    taRepetindoPrc = true;
                    break;
                }
            }

            if(!taRepetindoPrc) 
                list.add(p);
            
        }

        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        int N = sc.nextInt(); sc.nextLine();
        String[] allPokemos = new String[N];

        for(int i = 0; i < N; i++) 
            allPokemos[i] = sc.nextLine();
        
        List<String> excl = exclusivesPomekons(allPokemos);
        
        System.out.println("Falta(m) " + (TOTAL - excl.size()) + " pomekon(s).");
        
        sc.close();
    }
}
