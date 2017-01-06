import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ReducedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] ch = s.toCharArray();
        List<Character> list = new LinkedList<Character>();
        for(int i = 0; i < ch.length; i++){
            list.add(ch[i]);
        }
        for(int i = 0; i < list.size() - 1; i++){
            if(i < 0)
                i = 0;
            if(list.get(i) == list.get(i + 1)){
                list.remove(i + 1);
                list.remove(i);
                i -= 2;
            }
        }


        if(list.size() == 0)
            System.out.println("Empty String");
        else {
            for(int i = 0; i < list.size(); i++)
                System.out.print(list.get(i));
            System.out.println();
        }
    }
}
