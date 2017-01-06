import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Acronym {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");
        int k = sc.nextInt();
        for(int i = 0; i < k; i++){
            list.add(sc.next());
        }

        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String s = sc.next();
            if(!list.contains(s)){
                char ch = s.charAt(0);
                sb.append(Character.toUpperCase(ch) + ".");

            }
        }
        if(sb.charAt(sb.length() - 1) == '.')
            System.out.println(sb.substring(0,sb.length() - 1));
        else
            System.out.println(sb);
    }
}
