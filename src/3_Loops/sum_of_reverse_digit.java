import java.util.Scanner;

public class sum_of_reverse_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter the number: ");
         int n = sc.nextInt();
         int a = n;
         int rev = 0;
        while(n!=0){
            rev*=10;
            rev+=n%10;
            n/=10;
        }
        System.out.println(rev+a);
        }
    }

