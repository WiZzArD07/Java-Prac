import java.util.Scanner;
public class greatest_number {
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = av.nextInt();
        System.out.print("Enter the second number: ");
        int b = av.nextInt();
        System.out.print("Enter the third number: ");
        int c = av.nextInt();

        if(a >= b && a >= c){
            System.out.println(a+ " is greatest number");
        }
        else if(b >= a && b >= c){
            System.out.println(b+ " is greatest number");
        }
        else{
            System.out.println(c+ " is greatest number");
        } 
    }
}
