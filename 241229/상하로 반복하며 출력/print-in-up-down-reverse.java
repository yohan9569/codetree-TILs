import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() + 1;

        for (int i=1; i<n; i++) {
            for (int j=1; j<n; j++) {
                if (j%2==1) System.out.print(i);
                else System.out.print(n-i);
            }
            System.out.println();
        }
    }
}