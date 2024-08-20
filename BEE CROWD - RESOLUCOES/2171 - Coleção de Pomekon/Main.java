import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
