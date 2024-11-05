import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int[] array = new int[N];
            int contador = 0;
            for(int j = 0; j < N; j++) {
                array[j] = sc.nextInt();
            }
            for (int j = 1; j < N; j++) {
                int tmp = array[j];
                int k = j - 1;
                while ((k >= 0) && (array[k] > tmp)) {
                    array[k + 1] = array[k];
                    k--;
                    contador++;
                }
                array[k + 1] = tmp;
            }
            System.out.println(contador);
        }

        sc.close();
    }
}