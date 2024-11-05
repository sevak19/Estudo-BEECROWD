import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()){
            int N = sc.nextInt();
            ArrayList<Processo> processos = new ArrayList<>();
            int maiorTempo = 0;
            int tempo = 0;
            for(int i = 0; i < N; i++){
                Processo processo = new Processo(sc.nextInt(), sc.nextInt());
                processos.add(processo);
                if(processo.T > maiorTempo){
                    maiorTempo = processo.T;
                }
            }
            for(int i = 0; i < maiorTempo; i++){
                for(Processo processo : processos){
                    if(i == processo.T){
                        tempo +=processo.C;
                    }
                }
            }
            System.out.println(tempo);
        }

        sc.close();
    }
}

class Processo {
    int T;
    int C;

    public Processo (int T, int C) {
        this.T = T;
        this.C = C;
    }
}
