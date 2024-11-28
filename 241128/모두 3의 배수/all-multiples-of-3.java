import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, ans = 1;
        for (int i = 0; i < 5; i++) {
            if (sc.nextInt() % 3 != 0) {
                ans = 0;
                break;
            }
        }
        System.out.println(ans);
    }
}