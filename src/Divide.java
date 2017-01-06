import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int count = 0;
            String n = sc.next();
            int num = Integer.parseInt(n);
            for(int i = 0; i < n.length(); i++){
                int val = Character.getNumericValue(n.charAt(i));
                if(val != 0 && num % val == 0)
                    count++;
            }
            System.out.println(count);
            t--;
        }
    }
}
