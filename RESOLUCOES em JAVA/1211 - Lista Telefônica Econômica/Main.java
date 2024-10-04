import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()){
            int N = sc.nextInt();
            sc.nextLine();

            List<String> numeros = new ArrayList<>(N);

            for(int i = 0; i < N; i++) {
                numeros.add(sc.nextLine());
            }
            int qnt = 0;
            for(int i = 1; i < N; i++) {
                for(int j = 0; j < numeros.get(0).length(); j++){
                    if(numeros.get(0).charAt(j) == numeros.get(i).charAt(j)) {
                        qnt++;
                    } else {
                        j = numeros.get(0).length();
                    }
                }
            }
            System.out.println(qnt);
        }

        sc.close();
    }
}