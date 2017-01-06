import java.util.Scanner;

/**
 * Created by ameya on 24/10/16.
 */
public class Fibo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] a = new long[(int)n + 1];
        System.out.println(fibo(a, n));
    }

    public static long fibo(long[] a, long n){
        if(n <= 1)
            return 1;
        if(a[(int)n] == 0) {
            a[(int)n] = fibo(a, n - 1) + fibo(a, n - 2);
        }
        return a[(int)n];
    }
}
