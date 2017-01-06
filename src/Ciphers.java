import java.util.Scanner;

public class Ciphers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            String s = sc.next();
            long score = 1;
            boolean pallindrome = true;
            for(int i = 0, j = s.length() - 1; i < j; i++, j--){
                char c1 = s.charAt(i);
                char c2 = s.charAt(j);
                long num1 = Character.getNumericValue(c1) - 9;
                long num2 = Character.getNumericValue(c2) - 9;
                score *= num1 * num2;
                if(c1 != c2){
                    pallindrome = false;
                }
            }


            if(!pallindrome){
                if(s.length() % 2 == 0)
                    System.out.println(score);
                else{
                    char c2 = s.charAt((s.length() - 1) / 2);
                    long num = Character.getNumericValue(c2) - 9;
                    System.out.println(score * num);
                }
            }else
                System.out.println("Palindrome");
            t--;
        }
    }
}
