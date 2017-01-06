import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Parcel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        List<Integer> l = new LinkedList<>();
        int i = 0;
        int j = 0;

        for(int k = 1; k <= n; k++){
            l.add(k);
        }

        for(;;){

            char ch = s.charAt(i);
            if(ch == 'a' && l.size() > 1){
                if(j >= l.size() - 1)
                    j = 0;
                else
                    j++;
            }else if(ch == 'b' && l.size() > 1){
                l.remove(j);
                if(j >= l.size())
                    j = 0;
            }
            if(i >= s.length() - 1)
                i = 0;
            else
                i++;

            if(l.size() == 1){
                System.out.println(l.get(0));
                break;
            }
        }
    }
}
