import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, cnt=0;
        for (int i=0; i<5; i++) {
            x = sc.nextInt();
            if (x%2==0) cnt+=1;
        }
        System.out.print(cnt);
    }
}