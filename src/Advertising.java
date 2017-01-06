import java.util.Scanner;

public class Advertising {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 5 / 2;
        int total = 0;
        int liked = num;

        for(int i = 0; i < n - 1; i++){
            total = num * 3;
            num =  total / 2;
            liked += num;
        }
        System.out.println(liked);
    }
}
