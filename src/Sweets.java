import java.util.Scanner;

public class Sweets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int s = sc.nextInt();

            int num = n - s + 1;
            int start = n - num;
            int p = m + start;
            if(p > n)
                p = p % n;
            System.out.println(p);
            t--;
        }
    }
}
