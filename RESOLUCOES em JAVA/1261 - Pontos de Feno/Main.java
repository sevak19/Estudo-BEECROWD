import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        sc.nextLine();

        Palavra[] array = new Palavra[M];

        for(int i = 0; i < M; i++){
            String aux = sc.nextLine();
            String[] values = aux.split(" ");
            array[i] = new Palavra(values[0], Integer.parseInt(values[1]));
        }
        for(int i = 0; i < N; i++){
            int valor = 0;
            String linha = sc.nextLine();
            while(!linha.equals(".")){
                String[] values = linha.split(" ");
                for(String palavra : values){
                    for(int j = 0; j < M; j++){
                        if(palavra.equals(array[j].getPalavra())){
                            valor += array[j].getValor();
                            break;
                        }
                    }
                }
                linha = sc.nextLine();
            }
            System.out.println(valor);
        }

        sc.close();
    }
}

class Palavra {
    private String palavra;
    private int valor;

    public Palavra(String palavra, int valor){
        setPalavra(palavra);
        setValor(valor);
    }

    public String getPalavra() {
        return palavra;
    }
    public int getValor() {
        return valor;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
}