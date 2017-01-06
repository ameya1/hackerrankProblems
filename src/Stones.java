import java.util.*;

public class Stones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            Set<Integer> s = new TreeSet<>();
            if(n == 1){
                s.add(0);
            }else{
                int z = n - 2;
                int num = z * a;
                s.add(num + a);
                s.add(num + b);
                num = z * b;
                s.add(num + a);
                s.add(num + b);
            }

            for(Integer i : s)
                System.out.print(i + " ");
            System.out.println();
            t--;
        }

    }
}
