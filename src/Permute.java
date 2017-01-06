/**
 * Created by ameya on 24/11/16.
 */
public class Permute {
    public static void main(String[] args) {

        int[] a = new int[20];
        for(int i = 1; i <= a.length; i++)
            a[i - 1] = i;
        permute(0, a);
    }

    public  static void permute(int start, int[] input ) {
        if (start == input.length) {
            //System.out.println(input);
            for(int x: input){
                //System.out.print(x);
            }
            //System.out.println("");
            return;
        }
        for (int i = start; i < input.length; i++) {
            // swapping
            int temp = input[i];
            input[i] = input[start];
            input[start] = temp;
            // swap(input[i], input[start]);

            permute(start + 1, input);
            // swap(input[i],input[start]);

            int temp2 = input[i];
            input[i] = input[start];
            input[start] = temp2;
        }
    }
}
