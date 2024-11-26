import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ans = 0;
        for (int i=1; i<5000; i++) {
            n /= i;
            ans++;
            if (n <= 1) break;
        }
        System.out.println(ans);
    }
}