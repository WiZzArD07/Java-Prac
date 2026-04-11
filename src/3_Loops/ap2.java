import java.util.Scanner;
public class ap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth term: ");
        int n = sc.nextInt();
        int a = 99;
        int d = 4;

        for (int i = 1; i <= n; i++) {
            if(a<=0){
                break;
            }
            System.out.print(a+" ");
            a -= d;
        }
    }
}
