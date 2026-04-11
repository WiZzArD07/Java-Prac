import java.util.Scanner;
public class sequencenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n/2; i++) {
            System.out.println(i);
            System.out.println(n-1+1);
        }
        if(n%2!=0){
            System.out.println(n/2+1);
        }
    }
}
