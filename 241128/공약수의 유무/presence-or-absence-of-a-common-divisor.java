import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), ans = 0;
        for (int i = a; i <= b; i++) {
            if (1920%i==0 && 2880%i==0) {
                ans = 1;
                break;
            }
        }
        System.out.println(ans);
    }
}