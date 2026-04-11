import java.util.Scanner;
public class gp {
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        System.out.print("Enter the nth term: ");
        int n = av.nextInt();
        System.out.print("Enter the first term: ");
        int a  = av.nextInt();
        System.out.print("Enter the common ratio: ");
        int r = av.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.println(a+" ");
            a *= r; // a = a*r
        }
    }
}
