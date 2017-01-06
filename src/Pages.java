import java.util.Scanner;

/**
 * Created by ameya on 21/10/16.
 */
public class Pages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int page = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            int val = 0;

            while(true){
                if(val + k <= num){
                    val = val + k;
                }else{
                    val = val + (num % k);
                }
                page++;
                if(val > num) {
                    val = 0;
                    break;
                }
                if(page <= val)
                    count++;
                if(val == num)
                    break;
            }
        }

        System.out.println(count);

    }
}
