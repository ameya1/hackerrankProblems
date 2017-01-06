import java.util.Scanner;

/**
 * Created by ameya on 7/11/16.
 */
public class Cipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            String s = sc.next();
            int n = 13;
            char[] arr = new char[s.length()];
            char old = '1';
            for(int i = 0; i < s.length(); i++){

                char ne = s.charAt(i);
                int val = Character.getNumericValue(ne - 48);
                if(val + n > 26) {
                    val = (val + n) % 26;
                    ne = (char) ('a' + val);
                }
                else
                    ne = (char) (ne + n);





                if(ne == old){
                    n = n + 1;
                    if(n > 26)
                        n = 1;

                }
                //int val = Character.getNumericValue(ne - 48);
/*                if(val + n > 26) {
                    val = (val + n) % 26;
                    ne = (char) (ne + val);
                }else
                    ne = (char) (ne + n);
                arr[i] = ne;
                old = ne;
                n = 13;*/
            }
            t--;
        }
    }
}
