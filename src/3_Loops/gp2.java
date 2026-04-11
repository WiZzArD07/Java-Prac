import java.util.Scanner;

public class gp2 {
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        System.out.print("Enter the nth term: ");
        int n = av.nextInt();

        for(int i = 1; i<=n; i++){
            System.out.println(i);
            System.out.println(n-i+1);
        }
    }
}
