import java.util.Scanner;
public class ternary_variable {
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = av.nextInt();
        int num = (n>=0) ? 100 : 0;
        System.out.println(num);
    }
}

