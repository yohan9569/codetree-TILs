import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        for (int i=a/2*2+1; i<=b; i+=2) {
            System.out.print(i + " ");
        }
    }
}