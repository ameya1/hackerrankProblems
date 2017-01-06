import java.math.BigInteger;
import java.util.Scanner;

public class Repeated {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        BigInteger n = new BigInteger(sc.next());
        int strLength = str.length();
        BigInteger num = n.divide(BigInteger.valueOf(strLength));
        BigInteger total = num.multiply(BigInteger.valueOf(strLength));
        int count = 0;
        for(int i = 0; i < strLength; i++){
            if(str.charAt(i) == 'a')
                count++;
        }
        BigInteger size = num.multiply(BigInteger.valueOf(count));
        BigInteger fin = n.subtract(total);
        int f = fin.intValue();
        for(int i = 0; i < f; i++){
            if(str.charAt(i) == 'a')
                size = size.add(BigInteger.ONE);
        }
        System.out.println(size);
    }
}
