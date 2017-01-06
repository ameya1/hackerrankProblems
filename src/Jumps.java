import java.util.Scanner;

public class Jumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int e = 100;

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i += k){
            if(a[i] == 0)
                e -= 1;
            else if(a[i] == 1)
                e -= 3;
        }
        System.out.println(e);
    }
}
