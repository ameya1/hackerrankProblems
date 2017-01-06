import java.util.Scanner;

public class Triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] a = new int[n];
        int count = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(a[j] - a[i] == d){
                    for(int k = j + 1; k < n; k++){
                        if(a[k] - a[j] == d){
                            count++;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
