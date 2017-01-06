import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Simple {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] mon1 = new int[n];
        int[] mon2 = new int[m];

        for(int i = 0; i < n; i++){
            mon1[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            mon2[i] = sc.nextInt();
        }

        int m1 = calc(mon1, mon2);
        int m2 = calc(mon2, mon1);

        if(m1 > m2)
            System.out.println("Monk " + (m1 - m2));
        else if(m1 < m2)
            System.out.println("!Monk " + (m2 - m1));
        else
            System.out.println("Tie");
    }

    public static int calc(int[] m1, int[] m2){
        int sCount = 0;
        int gCount = 0;
        Map<Integer, Integer> fmap = new HashMap<>();
        Map<Integer, Integer> gmap = new HashMap<>();
        int score = 0;

        for(int i = 0; i < m1.length; i++){
            for(int j = 0; j < m2.length; j++){
                if(m1[i] > m2[j])
                    sCount++;
                else if(m1[i] < m2[j])
                    gCount++;
            }
            fmap.put(m1[i], sCount);
            gmap.put(m1[i], gCount);
            sCount = 0;
            gCount = 0;
        }

        for(int i = 0; i < m1.length; i++){
            score += fmap.get(m1[i]) * gmap.get(m1[i]);
        }
        return score;
    }
}
