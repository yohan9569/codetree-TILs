import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sex = sc.nextInt(), age = sc.nextInt();
        String ans;

        if (sex == 0) {
            if (age >= 19) ans = "MAN";
            else ans = "BOY";
        }
        else {
            if (age >= 19) ans = "WOMAN";
            else ans = "GIRL";
        }

        System.out.println(ans);
    }
}