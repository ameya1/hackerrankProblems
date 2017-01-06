import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by ameya on 13/11/16.
 */
public class Sequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            BigInteger n = sc.nextBigInteger();
            //if(n.compareTo(BigInteger.valueOf(1)))
            //System.out.println(fact(n).add(n.multiply(BigInteger.valueOf(3).multiply(n.subtract(BigInteger.valueOf(3))))));
            BigInteger fact = BigInteger.valueOf(1);
            for (int i = 1; n.compareTo(BigInteger.valueOf(i)) >= 0; i++)
                fact = fact.multiply(BigInteger.valueOf(i));
            System.out.println(fact);
            t--;
        }
    }

    static BigInteger fact(BigInteger n){
        if(n.compareTo(BigInteger.ONE) == 0)
            return BigInteger.ONE;
        return n.multiply(fact(n.subtract(BigInteger.ONE)));
    }
}
