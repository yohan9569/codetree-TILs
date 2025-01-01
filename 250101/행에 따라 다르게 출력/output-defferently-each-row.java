import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cnt = 0;
        sc.close();

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                cnt = cnt + (i%2==0 ? 1 : 2);
                System.out.print(cnt + " ");
            }
            System.out.println();
        }
    }
}