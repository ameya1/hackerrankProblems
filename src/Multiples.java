import java.util.Scanner;

class Multiples {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t > 0){
            long n = sc.nextLong();
            long a = (n - 1) % 3;
            a = n - 1 - a;
            a = a / 3;

            long b = (n - 1) % 5;
            b = n - 1 - b;
            b = b / 5;

            long c = (n - 1) % 15;
            c = n - 1 - c;
            c = c / 15;

            long total = 3 * a * (a + 1) / 2 + 5 * b * (b + 1) / 2 - 15 * c * (c + 1) / 2;

            System.out.println(total);
            t--;
        }

    }
}

        /*for(long i=0;i<t;i++){
            long n = sc.nextLong();
            long a=0, b=0, d=0;
            a=(n-1)%3;
            a=n-1-a;
            a=a/3;
            b=(n-1)%5;
            b=n-1-b;
            b=b/5;
            d=(n-1)%15;
            d=n-1-d;
            d=d/15;
            long c= 3*a*(a+1)/2 + 5*b*(b+1)/2 - 15*d*(d+1)/2;
            System.out.println(c);
        }*/