import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        List<Integer> numeros = new ArrayList<>();
        int comeco1 = 1; 
        int conjunto1 = 0;
        int comeco2 = 2;
        int conjunto2 = 0;

        for ( int i = 0; i < N; i++ ) {
            numeros.add(sc.nextInt());
        }
        for( int i = 0; i < N; i++ ) {
            if(numeros.get(i) == comeco1) {
                if(comeco1 == 1){
                    comeco1++;
                }else{
                    comeco1--;
                }
                conjunto1++;
            }
            if(numeros.get(i) == comeco2) {
                if(comeco2 == 1){
                    comeco2++;
                }else{
                    comeco2--;
                }
                conjunto2++;
            }
        }

        if(conjunto1 > conjunto2) {
            System.out.println(conjunto1);
        }else{
            System.out.println(conjunto2);
        }

        sc.close();
    }
}
