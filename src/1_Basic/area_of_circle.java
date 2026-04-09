import java.util.Scanner;
public class area_of_circle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double r = sc.nextDouble();
        double a = 3.141592 * r * r;
        System.out.print("The area of the circle is: ");
        System.out.println(a);
    }
}