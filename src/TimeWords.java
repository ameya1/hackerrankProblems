import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TimeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        map.put(11, "eleven");
        map.put(12, "twelve");
        map.put(13, "thirteen");
        map.put(14, "fourteen");
        map.put(15, "fifteen");
        map.put(16, "sixteen");
        map.put(17, "seventeen");
        map.put(18, "eighteen");
        map.put(19, "nineteen");
        map.put(20, "twenty");
        map.put(21, "twenty one");
        map.put(22, "twenty two");
        map.put(23, "twenty three");
        map.put(24, "twenty four");
        map.put(25, "twenty five");
        map.put(26, "twenty six");
        map.put(27, "twenty seven");
        map.put(28, "twenty eight");
        map.put(29, "twenty nine");

        int h = sc.nextInt();
        int m = sc.nextInt();

        String min = "";
        if(m == 1)
            min = " minute";
        else
            min = " minutes";

        if(m == 0 || m == 00)
            System.out.println(map.get(h) + " o' clock");
        else if((m > 0 && m < 15) || (m > 15 && m < 30))
            System.out.println(map.get(m) + min + " past " + map.get(h));
        else if(m == 15)
            System.out.println("quarter past " + map.get(h));
        else if(m == 30)
            System.out.println("half past " + map.get(h));
        else if((m > 30 && m < 45) || (m > 45 && m < 59))
            System.out.println(map.get(60 - m) + min + " to " + map.get(h + 1));
        else if(m == 45)
            System.out.println("quarter to " + map.get(h + 1));
    }
}
