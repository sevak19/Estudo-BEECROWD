import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()){
            int Q = sc.nextInt();
            sc.nextLine();
            List<Aluno> alunos = new ArrayList<>(Q);
            for(int i = 0; i < Q; i++) {
                String entrada = sc.nextLine();
                String[] values = entrada.split(" ");
                Aluno aluno = new Aluno(values[0], values[1].charAt(0), Integer.parseInt(values[2]));
                alunos.add(aluno);
            }
            for(int i = 0; i < Q; i++) {
                int menor = i;
                for(int j = i + 1; j < Q - 1; j++) {
                    if(alunos.get(i).custo > alunos.get(j).custo){
                        menor = j;
                    }else if(alunos.get(i).custo == alunos.get(j).custo && alunos.get(i).regiao > alunos.get(j).regiao) {
                        menor = j;
                    }else if(alunos.get(i).custo == alunos.get(j).custo && alunos.get(i).regiao == alunos.get(j).regiao &&
                            alunos.get(i).nome.compareTo(alunos.get(j).nome) > 0) {
                        menor = j;
                    }
                }
                swap(menor, i, alunos);
            }
            for(Aluno aluno : alunos){
                System.out.println(aluno.nome);
            }
        }

        sc.close();
    }

    public static void swap (int A, int B, List<Aluno> alunos) {
        Aluno temp = alunos.get(A);
        alunos.set(A, alunos.get(B));
        alunos.set(B, temp);
    }
}

class Aluno {
    public String nome;
    public char regiao;
    public int custo;

    public Aluno (String nome, char regiao, int custo) {
        this.nome = nome;
        this.regiao = regiao;
        this.custo = custo;
    }
}