import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), sum = 0;
        for (; a<=b; a++) {
            if (a%6==0 && a%8!=0) sum += a;
        }
        System.out.print(sum);
    }
}