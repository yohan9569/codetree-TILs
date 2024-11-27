import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt(), sum = 0;
        double cnt = 0;
        while (19 < age && age < 30) {
            sum += age;
            cnt++;
            age = sc.nextInt();
        }
        System.out.println(String.format("%.2f", sum / cnt));
    }
}