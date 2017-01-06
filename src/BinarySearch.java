import java.util.*;

/**
 * Created by ameya on 16/11/16.
 */
public class BinarySearch {
    static void binarySearch(List<Integer> arr, int l, int h, int num){
        if(l < h){
            int mid = (l + h) / 2;
            if(arr.get(mid) == num) {
                System.out.println(mid);
                return;
            }
            if(arr.get(mid) > num)
                binarySearch(arr, l, mid, num);
            else if(arr.get(mid) < num)
                binarySearch(arr, mid + 1, h, num);
        }

    }

    public static void main(String[] args){
        List<Integer> list = random();
        Collections.sort(list);
        binarySearch(list, 0, list.size(), 1000);
    }

    public static List<Integer> random(){
        List<Integer> list = new LinkedList<>();
        Random r = new Random();
        for(int i = 0; i < 100000; i++){
            list.add(r.nextInt(100000));
        }

        return list;
    }
}
