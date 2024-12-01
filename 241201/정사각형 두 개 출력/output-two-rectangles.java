import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++) {
            sb.append("*");
        }
        String star = sb.toString();
        for (int i=0; i<2; i++) {
            for (int j=0; j<n; j++) {
                System.out.println(star);
            }
            System.out.println();
        }
    }
}