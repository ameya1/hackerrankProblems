import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Subset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];

        Set<Integer> s = new HashSet<>();

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if((a[i] + a[j]) % k != 0) {
                    s.add(a[i]);
                    s.add(a[j]);
                }
            }
        }

        System.out.println(s.size());
    }
}
