import java.util.*;

public class Equalize {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<>();

        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        for(Integer i : list){
            if(map.containsKey(i)){
                int val = map.get(i);
                val++;
                map.put(i, val);
            }else{
                map.put(i, 1);
            }
        }

        List<Integer> f = new ArrayList<>();
        for(Integer v : map.keySet()){
            f.add(map.get(v));
        }

        Collections.sort(f);
        System.out.println(list.size() - f.get(f.size() - 1));
    }
}
