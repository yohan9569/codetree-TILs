import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n*2+1; i++) {
            for (int j = 0; j < n*2+1; j++) {
                if (i%2==1 && j%2==1) {
                    System.out.print("  ");
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}