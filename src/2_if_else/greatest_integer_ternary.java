import java.util.Scanner;
public class greatest_integer_ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter the 3rd number: ");
        int c = sc.nextInt();
        System.out.println((a>b) ? ((a>c) ? a : c): ((b>c) ? b : c));
    }
}
