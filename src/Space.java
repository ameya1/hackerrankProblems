import java.util.Arrays;
import java.util.Scanner;

public class Space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] c = new int[m];
        int k = 0;
        int max = 0;

        for(int i = 0; i < m; i++){
            c[i] = sc.nextInt();
        }

        Arrays.sort(c);
        for(int i = 0; i < n; i++){
            int num = 0;
            int num2 = 0;
            int f = 0;

            if(k < m && c[k] < i)
                num = i - c[k];
            else if(k < m)
                num = c[k] - i;

            if(k < m - 1 && c[k + 1] < i)
                num2 = i - c[k + 1];
            else if(k < m - 1)
                num2 = c[k + 1] - i;

            if(num < num2)
                f = num;
            else {
                f = num2;
                k++;
            }

            if(max < f)
                max = f;
        }

        System.out.println(max);
    }
}
