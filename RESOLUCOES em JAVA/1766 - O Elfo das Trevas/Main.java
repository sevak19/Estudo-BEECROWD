import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            int N = sc.nextInt();
            int M = sc.nextInt();
            sc.nextLine();

            Rena[] renas = new Rena[N];

            for(int j = 0; j < N; j++){
                String linha = sc.nextLine();
                String[] values = linha.split(" ");
                renas[j] = new Rena(values[0], Integer.parseInt(values[1]), Integer.parseInt(values[2]), Float.parseFloat(values[3]));
            }

            for(int j = 0; j < N; j++){
                int maior = j;
                for(int k = j+1; k < N; k++){
                    if (renas[maior].getPeso() < renas[k].getPeso()) {
                        maior = k;
                    } else if (renas[maior].getPeso() == renas[k].getPeso() && renas[maior].getIdade() > renas[k].getIdade()) {
                        maior = k;
                    } else if (renas[maior].getPeso() == renas[k].getPeso() && renas[maior].getIdade() == renas[k].getIdade() &&
                               renas[maior].getAltura() > renas[k].getAltura()) {
                        maior = k;
                    } else if (renas[maior].getPeso() == renas[k].getPeso() && renas[maior].getIdade() == renas[k].getIdade() &&
                               renas[maior].getAltura() == renas[k].getAltura() && renas[maior].getNome().compareTo(renas[k].getNome()) > 0) {
                        maior = k;
                    }
                }
                swap(maior, j, renas);
            }


            System.out.println("CENARIO {" + (i + 1) + "}");
            for(int j = 0; j < M; j++) {
                System.out.println(j+1 + " - " + renas[j].getNome());
            }

        }

        sc.close();
    }

    public static void swap(int A, int B, Rena[] array){
        Rena aux = array[A];
        array[A] = array[B];
        array[B] = aux;
    }
}

class Rena {
    private String nome;
    private int peso;
    private int idade;
    private float altura;

    public Rena (String nome, int peso, int idade, float altura) {
        setNome(nome);
        setPeso(peso);
        setIdade(idade);
        setAltura(altura);
    }

    public String getNome(){
        return nome;
    }
    public int getPeso(){
        return peso;
    }
    public int getIdade(){
        return idade;
    }
    public double getAltura(){
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
}