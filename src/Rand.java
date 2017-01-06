import java.util.*;

/**
 * Created by ameya on 20/10/16.
 */
public class Rand {
    public static void main(String[] ar){
        Random r = new Random();
        Set s = new LinkedHashSet();
        for(int i = 0; ; i++){
            if(s.size() < 10)
                s.add((int)(Math.random() * 10 ) + 1);
            else
                break;
        }


        System.out.println(s);

    }
}
