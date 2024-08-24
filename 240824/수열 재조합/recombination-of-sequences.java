import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        Stack<Integer> st = new Stack<>();
        StringBuffer bf = new StringBuffer();
        int ascendingNum = 1;
        for(int i=0;i<n;i++) {
            int cur = arr[i];
            if (cur >= ascendingNum) {
                while (cur >= ascendingNum) {
                    st.push(ascendingNum++);
                    bf.append("+\n");
                }
                st.pop();
                bf.append("-\n");
            } else {
                if (st.pop() > cur) {
                    System.out.println("NO");
                    return;
                }else {
                    bf.append("-\n");
                }
            }
        }
        System.out.println(bf.toString());
    }
}