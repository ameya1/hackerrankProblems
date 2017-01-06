import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Alternating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            String s = sc.next();
            ArrayList<Character> list = new ArrayList<>();
            int count = 0;
            int start = 1;

            for(int i = 0; i < s.length(); i++){
                list.add(s.charAt(i));
            }

            for(int i = 1; i < list.size();){

                if(list.get(start) == list.get(i - 1)){
                    int j = start + 1;
                    for(;j < list.size();) {
                        if(list.get(start) == list.get(j)) {
                            j++;
                            count++;
                        }else
                            break;
                    }
                    list.subList(start, j);
                }else{
                    //list.subList(i, range).clear();
                    //i = range + 1;
                }
            }
            System.out.println(count);
            t--;
        }
    }
}
