import java.util.Scanner;

public class Kangaroo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int v1 = sc.nextInt();
        int x2 = sc.nextInt();
        int v2 = sc.nextInt();
        int one = x1;
        int two = x2;

        if (x1 < x2 && v1 < v2)
            System.out.println("NO");
        else {
            while (true) {
                one += v1;
                two += v2;

                if (one == two) {
                    System.out.println("YES");
                    break;
                } else if (one > two) {
                    System.out.println("NO");
                    break;
                }

            }
        }
    }
}
