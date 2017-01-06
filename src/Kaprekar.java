import java.util.Scanner;

public class Kaprekar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = sc.nextInt();
        long e = sc.nextInt();
        boolean invalid = false;
        if(s < e)
            invalid = true;
        for(long i = s; i <= e; i++){
            if(number(i)) {
                System.out.print(i + " ");
                invalid = false;
            }
        }

        if(invalid)
            System.out.println("INVALID RANGE");

    }

    public static boolean number(long num){
        if(num == 1)
            return true;
        long sq = num * num;
        String val = String.valueOf(sq);
        int mid = 0;

        mid = (val.length() / 2);
        long l = 0;
        if(!val.substring(0, mid).equals(""))
            l = Integer.parseInt(val.substring(0, mid));
        long r = 0;
        //if(mid + 1 < val.length())
            r = Integer.parseInt(val.substring(mid));
        if((l + r) == num && r > 0)
            return true;
        return false;
    }
}
