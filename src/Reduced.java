import java.util.*;

public class Reduced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] ch = s.toCharArray();
        List<Character> l = new LinkedList<Character>();
        for(char c : ch){
            l.add(c);
        }
        Collections.sort(l);
        int start = 0;
        for(int i = 0; i < l.size() - 1; i++){
            char c1 = l.get(i);
            char c2 = l.get(i + 1);
            if(c1 == c2) {
                l.remove(i + 1);
                l.remove(i);
                i = i - 1;
            }
        }

        if(l.size() > 0){
            for(Character c : l)
                System.out.print(c);
            System.out.println();
        }else
            System.out.println("Empty String");
    }
}
