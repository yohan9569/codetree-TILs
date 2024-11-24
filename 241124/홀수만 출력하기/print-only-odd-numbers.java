import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x;
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            if (x % 2 != 0 && x % 3 == 0) System.out.println(x);
        }
    }
}