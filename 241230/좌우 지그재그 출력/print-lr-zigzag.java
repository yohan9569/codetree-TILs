import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i=1; i<=n; i++) {
            int roundMax = n * i, roundMin = roundMax - n + 1;
            for (int j=0; j<n; j++) {
                if (i%2==1) System.out.print(roundMin++ + " ");
                else System.out.print(roundMax-- + " ");
            }
            System.out.println();
        }
    }
}