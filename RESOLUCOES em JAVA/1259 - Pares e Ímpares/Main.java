import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                pares.add(num);
            } else {
                impares.add(num);
            }
        }
        for (int i = 1; i < pares.size(); i++) {
            int tmp = pares.get(i);
            int j = i - 1;
            while( (j >= 0) && (tmp < pares.get(j))) {
                pares.set(j+1, pares.get(j));
                j--;
            }
            pares.set(j+1, tmp);
        }
        for (int i = 1; i < impares.size(); i++) {
            int tmp = impares.get(i);
            int j = i - 1;
            while( (j >= 0) && (tmp > impares.get(j))) {
                impares.set(j+1, impares.get(j));
                j--;
            }
            impares.set(j+1, tmp);
        }
        for(int numero : pares) {
            System.out.println(numero);
        }
        for(int numero : impares) {
            System.out.println(numero);
        }

        System.out.println();

        sc.close();
    }
}