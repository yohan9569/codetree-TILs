import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "book";
        if (n < 1000) ans = "no";
        else if (n < 3000) ans = "mask";
        System.out.println(ans);
    }
}