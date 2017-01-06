import java.util.*;

public class Sticks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new LinkedList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        while(list.size() > 0){
            int min = Collections.min(list);
            int count = 0;
            for(int i = 0; i < list.size(); i++){

                if(list.get(i) > 0){
                    int val = list.get(i);
                    val -= min;
                    list.set(i, val);
                    count++;
                }
            }

            Iterator<Integer> itr = list.iterator();
            while(itr.hasNext()){
                if(itr.next() <= 0)
                    itr.remove();
            }

            System.out.println(count);
        }
    }
}