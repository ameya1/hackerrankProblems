import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try {
            s = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' ')
                continue;
            set.add(Character.toLowerCase(s.charAt(i)));
        }
        if(set.size() == 26)
            System.out.println("pangram");
        else
            System.out.println("not pangram");
    }
}
