import java.util.Scanner;


public class Cavity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] a = new char[n][n];
        for(int i = 0; i < n; i++){
            String s = sc.next();
            for(int j = 0; j < s.length(); j++) {
                a[i][j] = s.charAt(j);
            }
        }

        for(int i = 1; i < n - 1; i++){
            for(int j = 1; j < n - 1; j++) {
                int up = (a[i - 1][j] != 'X') ? Character.getNumericValue(a[i - 1][j]) : 10;
                int down = (a[i + 1][j] != 'X') ? Character.getNumericValue(a[i + 1][j]) : 10;
                int left = (a[i][j - 1] != 'X') ? Character.getNumericValue(a[i][j - 1]) : 10;
                int right = (a[i][j + 1] != 'X') ? Character.getNumericValue(a[i][j + 1]) : 10;
                int mid = Character.getNumericValue(a[i][j]);

                if(up < mid &&
                   down < mid &&
                   right < mid &&
                   left < mid){
                    a[i][j] = 'X';
                    j++;
                }
            }
        }

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
