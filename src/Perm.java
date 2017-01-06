import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ameya on 24/11/16.
 */
public class Perm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 1;
        List<Integer> l = new LinkedList<>();
        for(int i = 1; i <= n; i++) {
            l.add(i);
        }
        for(int i = 0; i < l.size(); i++){
            int val = 0;
            if(l.get(i) != 0)
                val = l.get(i);
            int abs = Math.abs(val - count);
            if(abs == k){
                count++;
                System.out.print(l.get(i) + " ");
                l.set(i, 0);
            }
        }
    }
}
