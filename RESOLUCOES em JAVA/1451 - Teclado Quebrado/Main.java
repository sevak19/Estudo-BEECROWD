import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()){
            String linha = sc.nextLine();
            String home = "";
            int i = 0;

            while(i < linha.length() && linha.charAt(i) != '[') i++;
            int j = i;
            while(j < linha.length() && linha.charAt(j) != ']') j++;
            if(i < linha.length() && j < linha.length()){
                home = linha.substring(i+1, j);
                home = home.replaceAll("\\[", "");
                home = home.replaceAll("\\]", "");
                linha = linha.substring(0, i + 1) + linha.substring(j);
            }
            linha = linha.replaceAll("\\[", "");
            linha = linha.replaceAll("\\]", "");
            System.out.println(home + linha);
        }

        sc.close();
    }
}
