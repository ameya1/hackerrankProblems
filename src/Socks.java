import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Socks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        List<Integer> list = new LinkedList<>();
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        for(int i = 0; i < list.size();i++){
            for(int j = i + 1; j < list.size(); j++){
                if(list.get(i) == list.get(j)){
                    list.remove(j);
                    list.remove(i);
                    count++;
                    i = -1;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
