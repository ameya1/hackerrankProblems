import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        List<Integer> list = new ArrayList<>();
        int count = 0;

        for(int i = 0; i < n; i++){
            list.add(Character.getNumericValue(s.charAt(i)));
        }
        for(int i = 1; i < n - 1; i++){
            if((list.get(i - 1) == 0) && (list.get(i) == 1) && (list.get(i + 1) == 0)){
                /*if(list.get(i) == 0)
                    list.set(i, 1);
                else if(list.get(i) == 1)
                    list.set(i, 0);*/
                list.set(i + 1, 1);
                count++;
            }
        }

        System.out.println(count);
    }
}
