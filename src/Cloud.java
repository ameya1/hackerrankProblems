import java.util.Scanner;

public class Cloud {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int count = 0;

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < n - 1; i++){
            if(i + 2 < n) {
                if (a[i + 2] == 0) {
                    count++;
                    i++;
                }else if(a[i + 1] == 0)
                    count++;
            }else if(a[i + 1] == 0)
                count++;
        }
        System.out.println(count);
    }
}
