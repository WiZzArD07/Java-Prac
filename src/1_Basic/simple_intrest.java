import java.util.Scanner;

public class simple_intrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter the rate: ");
        double r = sc.nextDouble();
        System.out.print("Enter the time: ");
        int t = sc.nextInt();
        double si = (p*r*t)/100;
        System.out.print("The Simple Intrest is: " +si);
        

    }
}
