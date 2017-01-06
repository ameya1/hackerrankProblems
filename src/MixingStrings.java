import java.util.Scanner;

public class MixingStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        for(int k = 0; k < n - 1; k++){
            int i = 0, j = 0;
            for(i = 0, j = 0; i < s[k].length() && j < s[k + 1].length();){
                char ch = s[k].charAt(i);
                char ch1 = s[k + 1].charAt(j);

                if(ch != ch1){
                    i++;
                }else if(ch == ch1){
                    i++;
                    j++;
                }
            }

            sb.append(s[k].substring(0));
            sb.append(s[k + 1].substring(j));
        }

        System.out.println(sb.length());
    }
}
