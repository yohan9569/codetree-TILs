import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), star=1;
        for (int i=0; i<n; i++) {
            for (int j=0; j<star; j++) {
                System.out.print("*");
            }
            System.out.println();
            star+=2;
        }
    }
}