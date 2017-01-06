import java.math.BigInteger;
import java.util.Scanner;

public class LongFact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(BigInteger.valueOf(n)));
    }

    public static BigInteger fact(BigInteger n){
        if(n.compareTo(BigInteger.ONE) == 0 || n.compareTo(BigInteger.ZERO) == 0 )
            return BigInteger.ONE;

        return n.multiply(fact(n.subtract(BigInteger.valueOf(1))));
    }
}
