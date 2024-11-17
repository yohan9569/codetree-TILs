import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt(), a = sc.nextInt();
        for (int i = (b+1)/2*2-1; i >= a; i-=2) {
            System.out.print(i + " ");
        }
    }
}