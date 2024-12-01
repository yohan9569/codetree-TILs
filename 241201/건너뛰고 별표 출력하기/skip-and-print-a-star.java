import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i = 1;
        for (; i<=n; i++) {
            for (int j=0; j<i; j++) 
                System.out.print("*");
            System.out.println();
            System.out.println();
        }
        for (i-=2; i>0; i--) {
            for (int j=0; j<i; j++) 
                System.out.print("*");
            System.out.println();
            System.out.println();
        }
    }
}