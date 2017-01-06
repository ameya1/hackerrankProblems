import java.util.Scanner;

public class Sherlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            //int count = 0;

            double num = Math.sqrt(b) - Math.sqrt(a);
            if(b % Math.sqrt(b) == 0 || a % Math.sqrt(a) == 0)
                num++;
            System.out.println((int)num);

            t--;

        }
    }
}
