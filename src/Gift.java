import java.util.Scanner;

public class Gift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            long b = sc.nextLong();
            long w = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();
            long z = sc.nextLong();

            long min = (b * x) + (w * y);
            if(z < x && x >= y){
                long cost = b * z;
                long total = w + b;
                cost = (total * y) + cost;
                if(cost < min)
                    min = cost;
            }else if(z < y && x <= y){
                long cost = w * z;
                long total = w + b;
                cost = (total * x) + cost;
                if(cost < min)
                    min = cost;
            }
            System.out.println(min);
            t--;
        }
    }
}
