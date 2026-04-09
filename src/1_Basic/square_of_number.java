import java.util.Scanner;
public class square_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("The square of the number is: ");
        System.out.println(n*n);
    }
}
